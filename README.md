# Awesome RecyclerView Adapter
A Awesome Recycler Adapter that support DataBinding.
`BindingRecyclerAdapter` can bind and adapte your data by 2 abstract method.

## Getting Started
Two class that able simple bind and adapte data on RecyclerView.

### Requirements

First Step is you should implement RecyclerView lib on your project by Gradle:
```
implementation 'com.android.support:recyclerview-v7:27.1.1'
```

and next step, copy `BaseRecyclerAdapter` and `BindingRecyclerAdapter` to your project, 
In the following create a new Class and extend it from `BindingRecyclerAdapter` and enter your Generic type so override methods

* getLayout() 
* onBindView(RecyclerView.ViewHolder vh, ViewDataBinding binding, int position, TestModel testModel)

Return `xml` resource layout that used `<layout>` indside it, now You can use `onBindView`

### Example

```java
    @Override
    public int getLayout() {
        return R.layout.item_test;
    }

    @Override
    public void onBindView(RecyclerView.ViewHolder vh, ViewDataBinding binding, int position, TestModel testModel) {
        ItemTestBinding b = (ItemTestBinding) binding;
        b.txt.setText(position + " " + testModel.name);
    }
```
You can see `SampleAdapter`for better understanding.
