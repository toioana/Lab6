# Lab6

Hello,

For this lab I worked together with my collegue Teodor Neagu.

For the first exercise we created a linear layout, with vertical orientation in which we added an edit text, two buttons and a text view. 
The two buttons were added in another linear layout, which has horizontal orientation, inside the first layout. All these were created in 
activity_main.xml

For the second exercise, a new class, MySharedPreferences, was created and we completed the methods (constructor, save, getValue and 
clearSharedPreferences) and we learned that the methods are used to initialise, store, retrieve and clear data. We used SharedPreferences
to manipulate data inside the class.

We created then a new activity (SecondActivity.java, second_activity.xml) with contains only a textView for the moment.

After this, the method saveFunction was created, which corresponds to the button Save. In here, the object myPreferences was created, 
which has the purpose to store the data from the edit text, using the method previously created in MySharedPreferences (save).
Then the method for the button Go to Second Activity was created, in which we just made an intent that starts the second activity. 

Then in the Second activity, another object MySharedPreferences was created and through this obeject we called the method getValu and 
we retrieved the text previously added in the edit text. This text was added in the textView.

We chaged the colors of the app.
In the intent we added the text "We finished the lab", which was passed to the second activity and displayed in the textView together 
with the text for the EditTex.

Even if now it all seems easy, exercises 5 and 7 took a really long time. I can't explain why the current solution did't work from the 
first try on execise 5, then a loooot of different solutions were tried, then we tried one more time the first one cause it was really 
logic and easy and like magic, it worked this time.
For exercise 7, it was tricky to add and to retrieve text from the intent, googled it and tried some stuff for a while.




