# Exercise 4 - React Component Lifecycle

## Objectives

- Explain the need and benefits of the Component Lifecycle.
- Identify various Lifecycle Hook Methods.
- Understand the sequence of rendering a component.
- Implement componentDidMount().
- Implement componentDidCatch().

---

# What is Component Lifecycle?

A Component Lifecycle is the sequence of stages a React component goes through from creation until it is removed from the screen.

Lifecycle methods allow developers to execute code at different stages of a component's life.

---

# Phases of Component Lifecycle

1. Mounting
2. Updating
3. Unmounting
4. Error Handling

---

# Mounting Phase

Mounting is the process of creating and displaying a component for the first time.

Important methods:

- constructor()
- render()
- componentDidMount()

---

# constructor()

The constructor initializes the component's state and binds methods.

Example:

```jsx
constructor(props) {
    super(props);

    this.state = {
        posts: []
    };
}
```

---

# render()

The render() method returns the JSX that should be displayed in the browser.

Example:

```jsx
render() {
    return (
        <h1>Blog Posts</h1>
    );
}
```

---

# componentDidMount()

componentDidMount() is executed immediately after the component is rendered for the first time.

It is mainly used for:

- Fetching data from APIs
- Calling backend services
- Loading external resources

Example:

```jsx
componentDidMount() {
    this.loadPosts();
}
```

---

# Fetch API

The Fetch API is used to retrieve data from a server.

Example:

```jsx
fetch("https://jsonplaceholder.typicode.com/posts")
```

The returned data is converted into JSON using:

```jsx
response.json()
```

---

# State

State stores data that belongs to the component.

Example:

```jsx
this.state = {
    posts: []
}
```

State is updated using:

```jsx
this.setState({
    posts: data
});
```

---

# componentDidCatch()

componentDidCatch() is an Error Handling Lifecycle Method.

It catches runtime errors occurring in child components.

Example:

```jsx
componentDidCatch(error) {
    alert(error);
}
```

---

# Benefits of Lifecycle Methods

- Load data automatically.
- Handle errors gracefully.
- Improve application performance.
- Separate initialization logic from rendering.

---

# Rendering Sequence

constructor()

↓

render()

↓

Component displayed

↓

componentDidMount()

↓

Fetch API called

↓

State updated

↓

render() executes again

---

# Advantages

- Better control over component execution.
- Easy API integration.
- Improved error handling.
- Cleaner code organization.