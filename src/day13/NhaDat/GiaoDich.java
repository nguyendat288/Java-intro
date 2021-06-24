package day13.NhaDat;

public class GiaoDich {
        private int maGiaoDich;
        private String ngayGiaoDich;
        private double donGia;
        private String loai;
        private double dienTich;


        public GiaoDich() {
        }

        public GiaoDich(int maGiaoDich, String ngayGiaoDich, double donGia, String loai, double dienTich) {
            this.maGiaoDich = maGiaoDich;
            this.ngayGiaoDich = ngayGiaoDich;
            this.donGia = donGia;
            this.loai = loai;
            this.dienTich = dienTich;
        }

        public int getMaGiaoDich() {
            return maGiaoDich;
        }

        public void setMaGiaoDich(int maGiaoDich) {
            this.maGiaoDich = maGiaoDich;
        }

        public String getNgayGiaoDich() {
            return ngayGiaoDich;
        }

        public void setNgayGiaoDich(String ngayGiaoDich) {
            this.ngayGiaoDich = ngayGiaoDich;
        }

        public double getDonGia() {
            return donGia;
        }

        public void setDonGia(double donGia) {
            this.donGia = donGia;
        }

        public String getLoai() {
            return loai;
        }

        public void setLoai(String loai) {
            this.loai = loai;
        }

        public double getDienTich() {
            return dienTich;
        }

        public void setDienTich(double dienTich) {
            this.dienTich = dienTich;
        }

        @Override
        public String toString() {
            return "GiaoDich{" +
                    "maGiaoDich=" + maGiaoDich +
                    ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                    ", donGia=" + donGia +
                    ", loai='" + loai + '\'' +
                    ", dienTich=" + dienTich +
                    '}';
        }

}
