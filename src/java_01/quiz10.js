const data = {
   name: '흰둥이',
   owner: '신짱구',
   age: 1,
   arr: [1, 2, 3, 4],
   walk: function (str) {
      console.log(str)
      console.log('산책중')
   },
   change: function () { // quiz10
      console.log(this.name)
      this.owner = '훈이'
   },
}