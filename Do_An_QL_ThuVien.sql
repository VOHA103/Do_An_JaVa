
--------------------------------------------------------------------TẠO DATABASE---------------------------------------------------------------------
CREATE DATABASE Do_An_QL_ThuVien
go



--if exists(select name from sysdatabases where name='Do_An_QL_ThuVien')
--drop Database Do_An_QL_ThuVien
--go



USE Do_An_QL_ThuVien
GO


-------------------------------------------------TẠO BẢNG,KHOÁ CHÍNH,KHOÁ NGOẠI--------------------------------------
----------------tai khoan dang nhap
create table ACCOUNT
(
TENDANGNHAP NVARCHAR(50),
GMAIL NVARCHAR(50),
MATKHAU CHAR(50),
NHAPLAIMK CHAR(50),
CONSTRAINT PK_US PRIMARY KEY (TENDANGNHAP)
)

SELECT*FROM ACCOUNT

------------Bảng thủ thư
CREATE TABLE  THUTHU
(
MATT char(10) NOT NULL,
TENTT nvarchar(50),
GIOITINHTT nvarchar(3),
NGAYSINHTT date,
DIACHITT nvarchar(100),
DIENTHOAITT char(11),
EMAIL nvarchar(50),
CONSTRAINT PK_MATT PRIMARY KEY(MATT)

)
GO
------------Bảng lớp
CREATE TABLE LOP
(
MALOP char(10) NOT NULL,
TENLOP nvarchar(50),
CONSTRAINT PK_MALOP PRIMARY KEY(MALOP)
)
GO

------------Bang sinh vien
CREATE TABLE SINHVIEN
(
MASV CHAR(20) PRIMARY KEY,
MALOP CHAR(10),
MATT char(10),
HOTEN NVARCHAR(50),
NGAYSINH DATE,
GIOITINH NVARCHAR(5),
NOISINH NVARCHAR(50),
CONSTRAINT  FK_SV_MALOP FOREIGN KEY(MALOP) REFERENCES LOP(MALOP),
CONSTRAINT  FK_SV_MATT FOREIGN KEY(MATT) REFERENCES THUTHU(MATT)

)



------------Bảng sách
CREATE TABLE SACH
(
MAS char(10) not null,
TENS nvarchar(100),
TACGIA NVARCHAR(100),
NAMXB INT ,
LOAI NVARchar(50),
SOTRANG int,
GIA int,
TINHTRANG NVARCHAR(20),
CONSTRAINT PK_MAS PRIMARY KEY(MAS)

)
GO

------------Bảng mượn trả
CREATE TABLE MUONTRA
(
MAMT char(20)not null,
MASV CHAR(20)NOT NULL,
MAS char(10) NOT NULL,
SOLUONGMUON int,
HINHTHUCMUON nvarchar(50),

QUANLYTV NVARCHAR(50),
NGAYMUON date,
NGAYTRA date,
constraint pk_muontra primary key (MAMT)
)
GO




ALTER TABLE MUONTRA
ADD
CONSTRAINT FK_MUONTRA_MASV FOREIGN KEY(MASV) REFERENCES SINHVIEN(MASV),
CONSTRAINT FK_MUONTRA_MAS FOREIGN KEY(MAS) REFERENCES SACH(MAS)

GO



-------------------------------------------------------------Tạo ràng buộc toàn vẹn------------------------------------------------------------------
------------Bảng tài khoản
------------Bảng thủ thư
--GIỚI TÍNH THUỘC NAM HOẶC NỮ
ALTER TABLE THUTHU 
 ADD CONSTRAINT CHK_GIOITINH_TT CHECK(GIOITINHTT IN('NAM',N'NỮ'))

------------Bảng lớp
----TÊN LOP  LÀ DUY NHẤT
ALTER TABLE LOP 
ADD CONSTRAINT UNI_TENLOP UNIQUE(TENLOP)


------------Bảng sácH
------sỐ TRANG  PHẢI LỚN HƠN 0
ALTER TABLE SACH
 ADD CONSTRAINT CHK_SACH_SOTRANG  CHECK(SOTRANG>0)
 ------GIA PHẢI LỚN HƠN 0
ALTER TABLE SACH
 ADD CONSTRAINT CHK_SACH_GIA  CHECK(GIA>0)
 ----HÌNH THỨC MƯỢN  MẶC ĐỊNH LÀ "MƯỢN TẠI CHỖ " VÀ "MƯỢN VỀ NHÀ "
ALTER TABLE SACH
 ADD CONSTRAINT CHK_tinhtrang    CHECK(TINHTRANG IN (N'Còn',N'Hết'))


------------Bảng mượn trả
------SỐ LƯỢNG MƯỢN   PHẢI LỚN HƠN 0
ALTER TABLE MUONTRA
 ADD CONSTRAINT CHK_MUONTRA_SOLUONGMUON  CHECK(SOLUONGMUON>0)
--NGAY MUON NHO HON NGAY TRA 
ALTER TABLE MUONTRA
ADD CONSTRAINT CHECK_NGAYMUON  CHECK (NGAYMUON <= NGAYTRA)
----HÌNH THỨC MƯỢN  MẶC ĐỊNH LÀ "MƯỢN TẠI CHỖ " VÀ "MƯỢN VỀ NHÀ "
ALTER TABLE MUONTRA 
 ADD CONSTRAINT CHK_HINHTHUCMUON  CHECK(HINHTHUCMUON IN (N'Mượn tại chỗ ',N'Mượn về nhà'))


---------------------------------------------------------INSERT DỮ LIỆU-----------------------------------------------
------------Bảng tài khoản  ===KHỎI NHẬP  LIỆU 

------------Bảng thủ thư
set dateformat dmy
INSERT INTO THUTHU(MATT,TENTT,NGAYSINHTT,GIOITINHTT,DIENTHOAITT,EMAIL,DIACHITT)
VALUES
('TT01',N'Nguyễn Quốc Sơn'     ,'20/10/2001',N'Nam','0967616870','quocson@gmail.com',N'Mã Lò Bình Tân TPHCM'),
('TT02',N'Võ Thị Thu Hà'      ,'20/10/2001',N'Nữ','0967616879','thuha@gmail.com',N'Nguyễn Thị Tú Bình Tân TPHCM'),
('TT03',N'Nguyễn Tiến Đạt'    ,'20/10/2001',N'Nam','0545624864','tiendat@gmail.com',N'Lê Văn Quới Tân Phú TPHCM'),
('TT04',N'Dương Đông Duy'     ,'20/10/2001',N'Nam','1599965481','dongduy@gmail.com',N'Tên Lửa Bình Tân TPHCM'),
('TT05',N'Cáp Văn Quốc Huy'   ,'20/10/2001',N'Nam','1459784654','quochuy@gmail.com',N'Xuân Thới Q12 TPHCM'),
('TT06',N'Võ Chí Thái'        ,'20/10/2001',N'Nam','096615487','chithai@gmail.com',N'Trường Trinh Tân Bình TPHCM'),
('TT07',N'Phạm Thị Lệ Tuyền'  ,'20/10/2001',N'Nữ','0655487112','letuyen@gmail.com',N'Lê Văn Việt Q9 TPHCM'),
('TT08',N'Nguyễn Thị Lệ Thanh','20/10/2001',N'Nữ','0965586151','lethanh@gmail.com',N'Kha Vạn Cân Q9 TPHCM'),
('TT09',N'Phạm Như Thanh Tùng','20/10/2001',N'Nam','0965582151','thanhtung@gmail.com',N'Trương Văn Thành Q9 TPHCM'),
('TT10',N'Hoàng Thị Cẩm Vân'  ,'20/10/2001',N'Nữ','0967685412','camvan@gmail.com',N'Phan Văn Lưu Phú Nhuận TPHCM'),
('TT11',N'Hoàng  Vân'  ,'20/10/2001',N'Nữ','0967685412','camvan@gmail.com',N' TPHCM'),
('TT12',N'Hoàng Thị  Vân'  ,'20/10/2001',N'Nữ','0967685411','van@gmail.com',N' TPHCM'),
('TT13',N'Hoàng Thị Cẩm '  ,'20/10/2001',N'Nữ','0967685413','camvan@gmail.com',N' TPHCM'),
('TT14',N'Hoàng Cẩm '  ,'20/10/2001',N'Nữ','0967685412','hoangvan@gmail.com',N' TPHCM'),
('TT15',N'Hoàng  Cẩm Hân'  ,'20/10/2001',N'Nữ','0967685414','hann@gmail.com',N'TPHCM'),
('TT16',N'Hoàng  Cẩm Hương '  ,'20/10/2001',N'Nữ','0967685415','huong@gmail.com',N'TPHCM'),
('TT17',N'Hoàng  Hà  Vân'  ,'21/10/2001',N'Nữ','0967685416','havan@gmail.com',N' TPHCM'),
('TT18',N'Hoàng  Cẩm Liễu'  ,'20/10/2001',N'Nữ','0967685417','lieu@gmail.com',N'TPHCM'),
('TT19',N'Hoàng  Cẩm Chi '  ,'20/11/2001',N'Nữ','0967685418','chi@gmail.com',N'TPHCM'),
('TT20',N'Hoàng Vân  Cẩm '  ,'20/10/2000',N'Nữ','0967685419','cam@gmail.com',N'TPHCM')
go
select * from THUTHU
------------Bảng lớp
INSERT INTO LOP(MALOP,TENLOP)
VALUES
('ML01','10DHTH1'),
('ML02','10DHTH2'),
('ML03','10DHTH3'),
('ML04','10DHTH4'),
('ML05','10DHTH5'),
('ML06','10DHTH6'),
('ML07','10DHTH7'),
('ML08','10DHTH8'),
('ML09','10DHTH9'),
('ML10','10DHTH10')

select * from LOP
------------BẢNG SINH VIÊN

set dateformat dmy
INSERT INTO SINHVIEN VALUES
('SV001','ML01','TT01',N'Nguyễn Quốc Sơn'     ,'10/03/2001',N'Nam',N'Sóc Trăng '),
('SV002','ML02','TT02',N'Võ Thị Thu Hà'       ,'11/9/2001' ,N'Nữ' ,N'Bình Dương '),
('SV003','ML03','TT03',N'Nguyễn Tiến Đạt'     ,'4/03/2001' ,N'Nam',N'Bình Định'),
('SV004','ML04','TT04',N'Dương Đông Duy'      ,'06/12/2001',N'Nam',N'Tiền Giang'),
('SV005','ML05','TT05',N'Cáp Văn Quốc Huy'    ,'10/05/2001',N'Nam',N'Bình Định'),
('SV006','ML06','TT06',N'Võ Chí Thái'         ,'20/04/2001',N'Nam',N'TP.Hồ Chí Minh'),
('SV007','ML07','TT07',N'Phạm Thị Lệ Tuyền'   ,'11/02/2001',N'Nữ' ,N'Bình Định'),
('SV008','ML08','TT08',N'Nguyễn Thị Lệ Thanh' ,'12/03/2001',N'Nữ' ,N'Đà Nẵng'),
('SV009','ML09','TT09',N'Phạm Như Thanh Tùng' ,'20/05/2001',N'Nữ' ,N'Hà Tĩnh '),
('SV010','ML10','TT10',N'Hoàng Thị Cẩm Vân'   ,'20/03/2001',N'Nam',N'Bình Định')

select*from SINHVIEN

------------Bảng sách


INSERT INTO SACH(MAS,TENS,TACGIA,NAMXB,LOAI,SOTRANG,GIA,TINHTRANG )
VALUES
('MS01',N'Cảm Ơn Người Lớn'	         ,N'Nguyễn Nhật Ánh'     ,'2000',N'Giáo trình'                ,'200','23000',N'Còn'),
('MS02',N'Thánh Gióng'				 ,N'An Thiên'			 ,'1995',N'Giáo trình'		          ,'100','100000',N'Còn'),
('MS03',N'Lượm'						 ,N'Kim Đồng'			 ,'1993',N'Giáo trình'			      ,'500','122000',N'Còn'),
('MS04',N'Nhà Khảo Cổ'				 ,N'Nguyễn Phong Việt'   ,'1998',N'Văn hóa xã hội – Lịch sử'  ,'150','100000',N'Còn'),
('MS05',N'Bàn Về Khế Ước Xã Hội'     ,N'Trang Hạ'            ,'1885',N'Văn hóa xã hội – Lịch sử'  ,'300','150000',N'Còn'),
('MS06',N'Tiền Không Mua Được Gì'    ,N'Anh Khang'           ,'2000',N'thiếu nhi'	              ,'600','100000',N'Còn'),
('MS07',N'Ăn Khế Trả Vàng'			 ,N'Nguyễn Ngọc Thạch'   ,'2002',N'Truyện'	                  ,'520','300000',N'Còn'),
('MS08',N'Vịt Con Xấu Xí'			 ,N'Hamlet Trương'       ,'2003',N'Truyện'	                  ,'300','180000',N'Hết'),
('MS09',N'Ông Già Nhìn Ra Thế Giới'  ,N'Đỗ Nhật Nam'         ,'1997',N'Tâm lý'                    ,'800','100000',N'Còn'),
('MS10',N'Kinh Tế Chính Trị'		 ,N'Nguyễn Ngọc Sơn'     ,'1990',N'Chính trị – pháp luật'      ,'900','500000',N'Còn'),
('MS11',N'The Last Lecture - Bài giảng cuối cùng'		 ,N'Randy Pausch & Jeffrey Zaslow'     ,'1990',N'Tâm lý','900','109000',N'Còn'),
('MS12',N'Không gia đình'		 ,N'Hector Malot'     ,'2016',N'Tiểu thuyết'      ,'100','40000',N'Còn'),
('MS13',N'Ông già và biển cảị'		 ,N'Ernest Hemingway'     ,'2016',N'Tiểu thuyết'      ,'500','50000',N'Còn'),
('MS14',N'Tội ác và trừng phạt'		 ,N' Fyodor Mikhailovich Dostoevsky'     ,'2016',N'Tiểu thuyết'      ,'200','30000',N'Còn'),
('MS15',N'Từng có một người yêu tôi như sinh mệnh'		 ,N'Thư Nghi'     ,'2017',N'Truyện ngôn tình'      ,'200','60000',N'Còn'),
('MS16',N'Kỹ thuật lập trình '		 ,N'Nguyễn Ngọc Sơn'     ,'1990',N'Chính trị – pháp luậ'      ,'900','500000',N'Còn'),
('MS17',N'Kinh Tế '		 ,N'Nguyễn Ngọc Sơn'     ,'1990',N'Chính trị – pháp luậ'      ,'900','500000',N'Còn'),
('MS18',N'Xác xuất thống kê '		 ,N'Nguyễn Ngọc'     ,'2013',N'Giáo trình '      ,'500','40000',N'Còn'),
('MS19',N'Giải tích'		 ,N'Nguyễn  Sơn'     ,'2012',N'Giáo trình '      ,'300','20000',N'Còn'),
('MS20',N'Đại số tuyến tính'		 ,N'Nguyễn Hoa  '     ,'2011',N'Giáo trình'      ,'90','10000',N'Còn')

select * from SACH
------------Bảng mượn trả


set dateformat dmy
INSERT INTO MUONTRA(MAMT,MASV,MAS,SOLUONGMUON,HINHTHUCMUON,QUANLYTV ,NGAYMUON,NGAYTRA)
VALUES
('MT001 ','SV001','MS01',3 ,N'Mượn về nhà'  ,N'Nguyễn Quốc Sơn'    ,'05/10/2021','10/10/2021'),
('MT002 ','SV002','MS02',2 ,N'Mượn tại chỗ ',N'Võ Thị Thu Hà'      ,'06/10/2021','06/10/2021'),
('MT003 ','SV003','MS03',4 ,N'Mượn về nhà'  ,N'Nguyễn Tiến Đạt'    ,'04/10/2021','10/10/2021'),
('MT004 ','SV004','MS04',3 ,N'Mượn tại chỗ ',N'Dương Đông Duy'     ,'03/10/2021','03/10/2021'),
('MT005 ','SV005','MS05',1 ,N'Mượn về nhà'  ,N'Cáp Văn Quốc Huy'   ,'02/10/2021','07/10/2021'),
('MT006 ','SV006','MS06',3 ,N'Mượn tại chỗ ',N'Võ Chí Thái'        ,'05/10/2021','05/10/2021'),
('MT007 ','SV007','MS07',5 ,N'Mượn về nhà'  ,N'Phạm Thị Lệ Tuyền'  ,'08/10/2021','10/10/2021'),
('MT008 ','SV008','MS08',3 ,N'Mượn tại chỗ ',N'Nguyễn Thị Lệ Thanh','03/10/2021','03/10/2021'),
('MT009 ','SV009','MS09',2 ,N'Mượn về nhà'  ,N'Phạm Như Thanh Tùng','07/10/2021','11/10/2021'),
('MT010 ','SV010','MS10',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/10/2021'),
('MT011 ','SV007','MS19',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'04/10/2021','05/10/2021'),
('MT012 ','SV003','MS10',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/10/2021'),
('MT013','SV007','MS16',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'03/10/2021','05/10/2021'),
('MT014','SV009','MS17',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'02/10/2021','03/10/2021'),
('MT015','SV001','MS10',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/10/2021'),
('MT016','SV006','MS09',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/10/2021'),
('MT017','SV010','MS10',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','03/10/2021'),
('MT018','SV003','MS11',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','02/10/2021'),
('MT019','SV001','MS20',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/11/2021'),
('MT020 ','SV003','MS10',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/10/2021'),
('MT021','SV007','MS16',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'03/10/2021','05/10/2021'),
('MT022','SV009','MS17',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'02/10/2021','03/10/2021'),
('MT023','SV001','MS10',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/10/2021'),
('MT024','SV006','MS09',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/10/2021'),
('MT025','SV010','MS10',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','03/10/2021'),
('MT026','SV003','MS11',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','02/10/2021'),
('MT027','SV001','MS20',1 ,N'Mượn về nhà'  ,N'Hoàng Thị Cẩm Vân'  ,'01/10/2021','05/11/2021')
go

delete from MUONTRA