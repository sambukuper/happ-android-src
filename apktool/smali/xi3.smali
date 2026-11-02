.class public final Lxi3;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Z

.field public final synthetic b:Lyi3;


# direct methods
.method public constructor <init>(Lyi3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxi3;->b:Lyi3;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lxi3;->a:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lxi3;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p0, p0, Lxi3;->b:Lyi3;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lyi3;->m(Landroid/view/MotionEvent;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lyi3;->m:Ly42;

    .line 23
    .line 24
    iget-object v2, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget-byte v1, v1, Ly42;->b:B

    .line 27
    .line 28
    shl-int/lit8 v3, v1, 0x8

    .line 29
    .line 30
    or-int/2addr v1, v3

    .line 31
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v1, v2}, Ly42;->b(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/high16 v2, 0xff0000

    .line 40
    .line 41
    and-int/2addr v1, v2

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget v2, p0, Lyi3;->l:I

    .line 50
    .line 51
    if-ne v1, v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iput v2, p0, Lyi3;->d:F

    .line 66
    .line 67
    iput p1, p0, Lyi3;->e:F

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    iput p1, p0, Lyi3;->i:F

    .line 71
    .line 72
    iput p1, p0, Lyi3;->h:F

    .line 73
    .line 74
    const/4 p1, 0x2

    .line 75
    invoke-virtual {p0, v0, p1}, Lyi3;->q(Landroidx/recyclerview/widget/l;I)V

    .line 76
    .line 77
    .line 78
    :cond_1
    :goto_0
    return-void
.end method
