package DecoratorPatternExample;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        // Basic email notification
        Notifier emailNotifier = new EmailNotifier();

        // Email + SMS
        Notifier smsDecorator = new SMSNotifierDecorator(emailNotifier);

        // Email + SMS + Slack
        Notifier slackDecorator = new SlackNotifierDecorator(smsDecorator);

        // Send notification through all channels
        slackDecorator.send("System maintenance at 10 PM.");
    }
}

