Welcome to the jMailinator wiki!

Mailinator REST API wrapper in Java, http://mailinator.com/apidocs.jsp

## Getting started

Mailinator provide a rich set of information for their RESTFUL API. jMailinator provides a rich Java wrapper around the API, allowing for quick and easy integration. 

### Token

Create a Mailinator account, login, and find your token at https://www.mailinator.com/settings.jsp

## Code Examples

Access to an inbox and print the details of an inbox message

```java
String apikey = "<YOUR MAILINATOR API KEY>";
String emailAddress = "EMAIL ADDRESS";
ArrayList<InboxMessage> inboxMessages = Mailinator.getInboxMessages(apikey, emailAddress);
        
        for(InboxMessage imsg : inboxMessages)
        {
             System.out.println(imsg);
        }
```

Access to an email (you just need the ID from the inbox message)

```java
String apikey = "<YOUR MAILINATOR API KEY>";
String emailAddress = "EMAIL ADDRESS";
ArrayList<InboxMessage> inboxMessages = Mailinator.getInboxMessages(apikey, emailAddress);
        
        for(InboxMessage imsg : inboxMessages)
        {
            System.out.println(imsg.getSubject());
            String msgId = imsg.getId();
            
            Email email = Mailinator.getEmail("<YOUR MAILINATOR API KEY>", msgId);
            System.out.println(email);
        }
```

## Dependencies

[json-simple](https://code.google.com/p/json-simple/)

## Contributing

1. Fork it ( https://github.com/AdamBoulton/jMailinator/fork )
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -am 'Add some feature')
4. Push to the branch (git push origin my-new-feature)
5. Create a new Pull Request

## License

Copyright (c) 2015 Adam Boulton Dev.

MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
