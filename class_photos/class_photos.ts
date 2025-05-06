function classPhotos(redShirtHeights: number[], blueShirtHeights: number[]): boolean {
  redShirtHeights.sort((a, b) => b - a);
  blueShirtHeights.sort((a, b) => b - a);

  const firstRowColor = blueShirtHeights[0] < redShirtHeights[0] ? "BLUE" : "RED";

  for (let i = 0; i < redShirtHeights.length; i++) {
      const redHeight = redShirtHeights[i];
      const blueHeight = blueShirtHeights[i];
      if (firstRowColor === "RED") {
          if (redHeight >= blueHeight) {
              return false;
          }
      } else {
          if (redHeight <= blueHeight) {
              return false;
          }
      }
  }
  return true;
}

const redShirtHeights = [5, 8, 1, 3, 4];
const blueShirtHeights = [6, 9, 2, 4, 5];
console.log(classPhotos(redShirtHeights, blueShirtHeights));
