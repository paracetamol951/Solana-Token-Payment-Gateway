$inputData = file_get_contents("php://input");
$jsonData = json_decode($inputData);
$secret = $jsonData->secret;
if ($secret == "[YOURSECRET]") {
	$paymentAmount = $jsonData->USD_Amount;
	$payerWallet = $jsonData->sourcePayment;
	$transactionID = $jsonData->trx;
	$myOrderID = $jsonData->myParam;
	// PROCESS THE PAYMENT HERE
}
