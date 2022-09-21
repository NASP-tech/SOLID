interface ShapeInterface
{
    public function area();
}

class Circle implements ShapeInterface
{
    public $radius;

    public function construct($radius)
    {
        $this->radius = $radius;
    }

    public function area()
    {
        return pi() * pow($shape->radius, 2);
    }
}

class Square implements ShapeInterface
{
    public $length;

    public function __construct($length)
    {
        $this->length = $length;
    }

    public function area()
    {
        return pow($this->length, 2);
    }
}

class AreaCalculator
{
    protected $shapes;

    public function __construct($shapes = [])
    {
        $this->shapes = $shapes;
    }

    public function sum()
    {
        foreach ($this->shapes as $shape) {
            if (is_a($shape, 'ShapeInterface')) {
                $area[] = $shape->area();
                continue;
            }

            throw new AreaCalculatorInvalidShapeException();
        }

        return array_sum($area);
    }
}