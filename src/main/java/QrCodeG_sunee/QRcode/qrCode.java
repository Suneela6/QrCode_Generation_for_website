package QrCodeG_sunee.QRcode;

import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
public class qrCode {



 public static void main(String[] args) throws Exception {
  
  String data = "https://action-potential-382813.web.app/";
  String path = "D:\\QRCODE\\QRcode_for_restaurant.jpg";
  
  BitMatrix matrix = new MultiFormatWriter()
    .encode(data, BarcodeFormat.QR_CODE, 500, 500);
  
  MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));

 }

}