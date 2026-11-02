.class public final Lwi7;
.super Lau;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

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
    check-cast p2, [Z

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
    check-cast p1, [Z

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
    aget-boolean p3, p1, v2

    .line 18
    .line 19
    invoke-virtual {p2, p3}, Lro3;->C(Z)V

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
    invoke-virtual {p2, p1}, Lro3;->V0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    array-length p0, p1

    .line 30
    :goto_1
    if-ge v2, p0, :cond_2

    .line 31
    .line 32
    aget-boolean p3, p1, v2

    .line 33
    .line 34
    invoke-virtual {p2, p3}, Lro3;->C(Z)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-virtual {p2}, Lro3;->D()V

    .line 41
    .line 42
    .line 43
    return-void
.end method
