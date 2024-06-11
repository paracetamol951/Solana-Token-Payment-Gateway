Stream req = Request.InputStream;req.Seek(0, System.IO.SeekOrigin.Begin);
string json = new StreamReader(req).ReadToEnd();

InputClass input = null;
try
{
	// assuming JSON.net/Newtonsoft library
	input = JsonConvert.DeserializeObject<InputClass>(json);
	string paymentAmount = input.USD_Amount;
	string payerWallet = input.sourcePayment;
	string transactionID = input.trx;
	string myOrderID = input.myParam;
	if (String.Compare(input.secret,"[YOUR SECRET]")==0) {
	// PROCESS THE PAYMENT HERE
	}
}

catch (Exception ex)
{
    return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
}
