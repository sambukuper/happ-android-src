.class public final Lzi7;
.super Lau;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {v0}, Ldj7;->a(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Lt37;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p2, [I

    .line 2
    .line 3
    array-length p0, p2

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 3

    .line 1
    check-cast p1, [I

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p3}, Lau;->p(Lt37;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    array-length p0, p1

    .line 15
    :goto_0
    if-ge v2, p0, :cond_0

    .line 16
    .line 17
    aget p3, p1, v2

    .line 18
    .line 19
    invoke-virtual {p2, p3}, Lro3;->c0(I)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    array-length p0, p1

    .line 27
    array-length p3, p1

    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p3, p0}, Lro3;->k(II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p1}, Lro3;->V0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    if-ge v2, p0, :cond_2

    .line 38
    .line 39
    aget p3, p1, v2

    .line 40
    .line 41
    invoke-virtual {p2, p3}, Lro3;->c0(I)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {p2}, Lro3;->D()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final o(Lri8;)Le41;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final q(Ld50;Ljava/lang/Boolean;)Lar3;
    .locals 1

    .line 1
    new-instance v0, Lzi7;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lau;-><init>(Lau;Ld50;Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final r(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 1

    .line 1
    check-cast p1, [I

    .line 2
    .line 3
    array-length p0, p1

    .line 4
    const/4 p3, 0x0

    .line 5
    :goto_0
    if-ge p3, p0, :cond_0

    .line 6
    .line 7
    aget v0, p1, p3

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lro3;->c0(I)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 p3, p3, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method
