interface ManageShapeInterface
{
    public function calculate();
}

interface ShapeInterface
{
    public function area();
}

interface ThreeDimensionalShapeInterface
{
    public function volume();
}

class Square implements ShapeInterface, ManageShapeInterface
{
    public function area()
    {
        // calculate the area of the square
    }

    public function calculate()
    {
        return $this->area();
    }
}

class Cuboid implements ShapeInterface, ThreeDimensionalShapeInterface, ManageShapeInterface
{
    public function area()
    {
        // calculate the surface area of the cuboid
    }

    public function volume()
    {
        // calculate the volume of the cuboid
    }

    public function calculate()
    {
        return $this->area();
    }
}