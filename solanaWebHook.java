String body = null;
StringBuilder stringBuilder = new StringBuilder();
BufferedReader bufferedReader = null;

try {
    InputStream inputStream = request.getInputStream();
    if (inputStream != null) {
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] charBuffer = new char[128];
        int bytesRead = -1;
        while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
            stringBuilder.append(charBuffer, 0, bytesRead);
        }
    } else {
        stringBuilder.append("");
    }
} catch (IOException ex) {
    // throw ex;
    return "";
} finally {
    if (bufferedReader != null) {
        try {
            bufferedReader.close();
        } catch (IOException ex) {
            
        }
    }
}

body = stringBuilder.toString();

JSONObject jObj = new JSONObject(getBody(request));

String paymentAmount = jObj.get("USD_Amount");
String payerWallet = jObj.get("sourcePayment");
String transactionID = jObj.get("trx");
String myOrderID = jObj.get("myParam");
String secret = jObj.get("secret");
if (secret.equals("[YOUR SECRET]") {
}
