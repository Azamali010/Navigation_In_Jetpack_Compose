# What is Navigation in Android?
'Navigation helps you in understanding how your app moves across different components in your Application.'

# Android JetPack Navigation helps in implementing your high-level navigation in a go-easy approach.

# The Navigation Component is made up of three major parts:

1. Navigation Graph: This is a resource that collects all navigation-related data in one place. This includes all of the locations in your app, referred to as destinations, as well as the possible paths a user could take through your app. It’s like a big book that has all the places you can go in an app and how you can move between them. Think of it as a map and a guide combined.
 
2. NavHost: This is a unique composable that you can include in your layout. It shows various destinations from your Navigation Graph. The NavHost links the NavController with a navigation graph that specifies the composable destinations that you should be able to navigate between. As you navigate between composables, the content of the NavHost is automatically recomposed. Each composable destination in your navigation graph is associated with a route.
 
3. NavController: The NavController is the central API for the Navigation component. It is stateful and keeps track of the back stack of composables that make up the screens in your app and the state of each screen.
