
import com.sun.tools.javac.util.Context

fun main() {

    // Transaction Notifications
    fun notifyNewTransaction(context: Context) {
        if (isNewTransaction()) {
            Toast.makeText(context, "New transaction posted to your account", Toast.LENGTH_SHORT).show()
        }
    }

    fun notifyLargeTransaction(context: Context, amount: Double) {
        if (isLargeTransaction(amount)) {
            Toast.makeText(context, "Large transaction detected: $amount", Toast.LENGTH_SHORT).show()
        }
    }

    fun notifyPendingTransactions(context: Context) {
        if (hasPendingTransactions()) {
            Toast.makeText(context, "You have pending transactions", Toast.LENGTH_SHORT).show()
        }
    }

    // Budget Alerts
    fun notifyBudgetExceeded(context: Context, category: String, threshold: Double) {
        if (isBudgetExceeded(category, threshold)) {
            Toast.makeText(context, "Budget exceeded for category: $category", Toast.LENGTH_SHORT).show()
        }
    }

    fun celebrateBudgetGoalReached(context: Context) {
        if (isBudgetGoalReached()) {
            Toast.makeText(context, "Congratulations! You've reached your budget goal", Toast.LENGTH_SHORT).show()
        }
    }

    // Account Updates
    fun notifyLowBalance(context: Context, threshold: Double) {
        if (isLowBalance(threshold)) {
            Toast.makeText(context, "Low balance alert: Threshold reached - $threshold", Toast.LENGTH_SHORT).show()
        }
    }

    fun notifyDirectDeposit(context: Context) {
        if (isDirectDeposit()) {
            Toast.makeText(context, "Direct deposit received", Toast.LENGTH_SHORT).show()
        }
    }

    // Bill Reminders
    fun notifyUpcomingBills(context: Context) {
        if (hasUpcomingBills()) {
            Toast.makeText(context, "Upcoming bills due soon", Toast.LENGTH_SHORT).show()
        }
    }

    fun confirmBillPayment(context: Context) {
        if (isBillPaymentConfirmed()) {
            Toast.makeText(context, "Bill payment confirmed", Toast.LENGTH_SHORT).show()
        }
    }

    // Security Alerts
    fun notifySuspiciousActivity(context: Context) {
        if (hasSuspiciousActivity()) {
            Toast.makeText(context, "Suspicious activity detected", Toast.LENGTH_SHORT).show()
        }
    }

    fun notifyLoginFromNewDevice(context: Context) {
        if (isNewDeviceLogin()) {
            Toast.makeText(context, "Login from new device detected", Toast.LENGTH_SHORT).show()
        }
    }

    // Goal Tracking
    fun updateGoalProgress(context: Context) {
        if (hasGoalProgress()) {
            Toast.makeText(context, "Goal progress updated", Toast.LENGTH_SHORT).show()
        }
    }

    fun celebrateGoalAchieved(context: Context) {
        if (isGoalAchieved()) {
            Toast.makeText(context, "Congratulations! You've achieved your goal", Toast.LENGTH_SHORT).show()
        }
    }

    // Interest and Rates
    fun notifyInterestAccrued(context: Context) {
        if (hasInterestAccrued()) {
            Toast.makeText(context, "Interest accrued", Toast.LENGTH_SHORT).show()
        }
    }

    fun alertRateChanges(context: Context) {
        if (hasRateChanges()) {
            Toast.makeText(context, "Interest rate changes detected", Toast.LENGTH_SHORT).show()
        }
    }

    // Promotions and Offers
    fun notifySpecialOffers(context: Context) {
        if (hasSpecialOffers()) {
            Toast.makeText(context, "Special offers available", Toast.LENGTH_SHORT).show()
        }
    }

    fun updateRewardPoints(context: Context) {
        if (hasRewardPointsUpdate()) {
            Toast.makeText(context, "Reward points updated", Toast.LENGTH_SHORT).show()
        }
    }

    // Educational Tips
    fun sendFinancialTips(context: Context) {
        if (hasFinancialTips()) {
            Toast.makeText(context, "New financial tip available", Toast.LENGTH_SHORT).show()
        }
    }

    fun provideSpendingInsights(context: Context) {
        if (hasSpendingInsights()) {
            Toast.makeText(context, "New spending insights available", Toast.LENGTH_SHORT).show()
        }
    }

    // Feedback and Support
    fun requestFeedback(context: Context) {
        if (hasFeedbackRequest()) {
            Toast.makeText(context, "We'd love to hear your feedback", Toast.LENGTH_SHORT).show()
        }
    }

    fun provideSupportAssistance(context: Context) {
        if (needsSupportAssistance()) {
            Toast.makeText(context, "How can we assist you?", Toast.LENGTH_SHORT).show()
        }
    }
}

// Notes:
// replace all if statements with the actual references
// find library for "Toast"
// Edit the style of the notification pop up according to UI design
// fix errors after compilation