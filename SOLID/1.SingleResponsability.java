class Circle
{
    public $radius;

    public function construct($radius)
    {
        $this->radius = $radius;
    }
}

class Square
{
    public $length;

    public function construct($length)
    {
        $this->length = $length;
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
            if (is_a($shape, 'Square')) {
                $area[] = pow($shape->length, 2);
            } elseif (is_a($shape, 'Circle')) {
                $area[] = pi() * pow($shape->radius, 2);
            }
        }

        return array_sum($area);
    }

    public function output()
    {
        return implode('', [
        '',
            'Sum of the areas of provided shapes: ',
            $this->sum(),
        '',
    ]);
    }
}

class SumCalculatorOutputter
{
    protected $calculator;

    public function __constructor(AreaCalculator $calculator)
    {
        $this->calculator = $calculator;
    }

    public function JSON()
    {
        $data = [
        'sum' => $this->calculator->sum(),
    ];

        return json_encode($data);
    }

    public function HTML()
    {
        return implode('', [
        '',
            'Sum of the areas of provided shapes: ',
            $this->calculator->sum(),
        '',
    ]);
    }
}