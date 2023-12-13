# DeStruct-Java
<h2>Setup</h2>
<ul>
  <li>Download the Visualizer Package</li>
  <li>Keep the package folder in our project directory or on the classpath</li>
  <li>Import the package in your code</li>
</ul>
<h2>How to use the visualization tool</h2>
<ul>
  <li> Go to http://44.195.111.155/ </li>
<li> If you don't have an account, sign-up for one, and then log-in (username is your email).</li>
<li> Once you’ve logged in, click start a new program, and provide a name for the program and select the type of assignment (self-use). </li>
<li> Once you’ve clicked create a program, copy the API key shown at the top of the screen. </li>
<li> Now that you have your API key, go into your java file that you’ll be running tests in. You’ll call Visualizer.Initialize(“yourAPI”) with your API as an input string. </li>
<li> Go through the Example.java file to learn more about what methods you’ll call to generate your figures.</li>
<li> To see the visualization just go to the visualization web page and refresh the page. All your visualizations should show up in the tabs you’ve given to each visualization.</li>
</ul>
<h2>Fuctionalities Offered by DeStruct</h2>
<h3>Public Methods</h3>
<h6>All methods are static</h6>
<h3>public static void setDataStructureType(String type)</h3>
<p>This method sets intended data-structure type for the visualizer. Default value is "graph" which is basically just inter-connected nodes.
Currently only other data structure type that is available to visualize is "tree". Calling this method with invalid datat structure will reset it to default.</p>
<h3>public static void resetDataStructuretype()</h3>
<p>As the name suggests, this method resets the visualizer's target data structure to "graph"</p>
<h3>public static void addClassNamesToVisualizeValue(String arr[], boolean discardBasicClass:optional)</h3>
<p>By default the visualization block shows the values of class members having basic data types (int, double, float, String, boolean). To include values (return value of tostring method) in the visualtion block of any other class, we can pass class names as an array of String. If we do not want values of basic data types, we can set discardBasicClass to true.</p>


<h3>public static void addToVisualizationTarget(String classname)</h3>
<p>Adds <classname> class to recursively explore for visualizations</p>
<h3>public static void addToVisualizationTarget(String[] classnames)</h3>
<p>Adds <classnames> to recursively explore for visualization</p>
<h3>public static void clearVisualizationTargets()</h3>
<p>Clears all the registered classes for recursive visualization</p>

<h3>public static void Visualize(Object obj, String Step) </h3>
<p>visualizes obj and all of the connected nodes that has datatypes registered for recursive visualization. Step is a string that marks a particular visualization call.</p>


<h3> public static void Visualize(String Step)</h3>
<p>Visualizes all registered objects and all of their connected nodes that has datatypes registered for recursive visualization. </p>
<h3> public static void register(Object object)</h3>
<p>Manually registers an object and it's connected nodes for recursive visualization.</p>
<h3>public static void unregister(Object object)</h3>
<p>Manually unregister an object from visualization queue. The object might still get visualizaed if one of its ancestor is registered visualization.</p>
<h3>public void clearRegistration()</h3>
<p>Clears the visualization array</p>


