.class public final Lhy1;
.super Lny1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public b(Le08;Le08;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p3, p0}, Lxt7;->f(Landroid/view/Window;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3, p0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Llr5;

    .line 24
    .line 25
    invoke-direct {p0, p4}, Llr5;-><init>(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 p2, 0x23

    .line 31
    .line 32
    if-lt p1, p2, :cond_0

    .line 33
    .line 34
    new-instance p1, Lb29;

    .line 35
    .line 36
    invoke-direct {p1, p3, p0}, Lz19;-><init>(Landroid/view/Window;Llr5;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/16 p2, 0x1e

    .line 41
    .line 42
    if-lt p1, p2, :cond_1

    .line 43
    .line 44
    new-instance p1, Lz19;

    .line 45
    .line 46
    invoke-direct {p1, p3, p0}, Lz19;-><init>(Landroid/view/Window;Llr5;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/16 p2, 0x1a

    .line 51
    .line 52
    if-lt p1, p2, :cond_2

    .line 53
    .line 54
    new-instance p1, Ly19;

    .line 55
    .line 56
    invoke-direct {p1, p3, p0}, Lx19;-><init>(Landroid/view/Window;Llr5;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance p1, Lx19;

    .line 61
    .line 62
    invoke-direct {p1, p3, p0}, Lx19;-><init>(Landroid/view/Window;Llr5;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    xor-int/lit8 p0, p5, 0x1

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Leu7;->k(Z)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
