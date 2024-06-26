# Solana-Token-Payment-Gateway
Process Solana Net-assembly Token payments and setup Solana webhook for payment notifications. 

HTML payment form to embed into website, payment QRcode, or payment link.

 Net-assembly token on Solana blockchain is meant to provide a variety of payment features to the community.
With this token, you can easily integrate Solana based payment forms in your website, application, or point of sale.
Payments can be requested with a payment url, or a form, or a QRcode.
This token will then use callbacks (HTTP webhook) in order to notify you about payments.
This allows a different method for implementing Solana based payments, with html form or link, and HTTP webhook, that is very easy to integrate into PHP, ASP, JAVA, Ruby projects.

# Demo

You can view an example of a payment page here :

https://pay.net-assembly.com/Pay/FPnfgC9ppJP9qbDyL2E5ZfDuvHuabec2XFfKufawP6p4/1/46/USD/Pay%20now/PARAM

# How to install on any website

You first need to register your webhook on the Neta Token homepage :
[Net-Assembly Token payment gateway](https://crypto.net-assembly.com)

When the form is submitted, you will get a webhook secret password you need to save in order to secure HTTP webhook notifications, and a webhook ID.

You will get also :
- HTML code of a payment form, to embed in your website
- A link that leads to a payment form, you can send by email
- A QRcode that your clients can scan to pay you

You can receive payment notification by email and on an notification URL (webhook).
You can customize the amount, the title of the order, and provide an optionnal parameter that will be transmitted with the webhook and email notifications, just replace the parameter 'PARAM'.
If you implemented our payment gateway and would like to be featured in the partners list, please contact us.

The payment URL is quite simple, and must respect the format :

    https://pay.net-assembly.com/Pay/[walletID]/[requestedAmount]/[webHookID]/[EUR or USD]/[Optionnal title for the order]/[OptionnalParameter]/

# Payment notification webhook

If you specified a webhook, a HTTP request will be made on payment on the URL you provided.
The data will be sent as a JSON encoded BODY of an HTTP request with the parameters :

    myParam : the parameter you provided in the payment link or form
    sourcePayment : the wallet address of the payer
    paidAmountInNeta : the amount paid in NETA token
    EUR_Amount : the amount in euros
    USD_Amount : the amount in USD
    trx : the transaction ID
    secret : your secret key

# Net-assembly Token

More info on Net-assembly Token can be found here :
[Net-Assembly Token payment gateway](https://crypto.net-assembly.com)
