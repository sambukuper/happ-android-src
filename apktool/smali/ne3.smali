.class public Lne3;
.super Lie3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;


# instance fields
.field public s0:Lv09;


# direct methods
.method public constructor <init>(Lv09;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lie3;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lne3;->s0:Lv09;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 6

    .line 1
    iget-object v0, p0, Lie3;->r0:Lv09;

    .line 2
    .line 3
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, p1, v1}, Lv09;->d(Lfi1;Lz24;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lie3;->q0:Lv09;

    .line 12
    .line 13
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v1, p1, v2}, Lv09;->d(Lfi1;Lz24;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sub-int/2addr v0, v1

    .line 22
    iget-object v1, p0, Lie3;->r0:Lv09;

    .line 23
    .line 24
    invoke-interface {v1, p1}, Lv09;->a(Lfi1;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v2, p0, Lie3;->q0:Lv09;

    .line 29
    .line 30
    invoke-interface {v2, p1}, Lv09;->a(Lfi1;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-int/2addr v1, v2

    .line 35
    iget-object v2, p0, Lie3;->r0:Lv09;

    .line 36
    .line 37
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v2, p1, v3}, Lv09;->b(Lfi1;Lz24;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iget-object v3, p0, Lie3;->q0:Lv09;

    .line 46
    .line 47
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v3, p1, v4}, Lv09;->b(Lfi1;Lz24;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-int/2addr v2, v3

    .line 56
    iget-object v3, p0, Lie3;->r0:Lv09;

    .line 57
    .line 58
    invoke-interface {v3, p1}, Lv09;->c(Lfi1;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iget-object p0, p0, Lie3;->q0:Lv09;

    .line 63
    .line 64
    invoke-interface {p0, p1}, Lv09;->c(Lfi1;)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    sub-int/2addr v3, p0

    .line 69
    add-int/2addr v2, v0

    .line 70
    add-int/2addr v3, v1

    .line 71
    neg-int p0, v2

    .line 72
    neg-int v4, v3

    .line 73
    invoke-static {p0, p3, p4, v4}, Ls31;->i(IJI)J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    invoke-interface {p2, v4, v5}, Ltr4;->o(J)Leo5;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget p2, p0, Leo5;->X:I

    .line 82
    .line 83
    add-int/2addr p2, v2

    .line 84
    invoke-static {p2, p3, p4}, Ls31;->g(IJ)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    iget v2, p0, Leo5;->Y:I

    .line 89
    .line 90
    add-int/2addr v2, v3

    .line 91
    invoke-static {v2, p3, p4}, Ls31;->f(IJ)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    new-instance p4, Lme3;

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-direct {p4, p0, v0, v1, v2}, Lme3;-><init>(Leo5;IIB)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Le02;->X:Le02;

    .line 102
    .line 103
    invoke-interface {p1, p2, p3, p0, p4}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method

.method public final Y0(Lv09;)Lv09;
    .locals 1

    .line 1
    iget-object p0, p0, Lne3;->s0:Lv09;

    .line 2
    .line 3
    new-instance v0, Lan8;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lan8;-><init>(Lv09;Lv09;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final Z0()V
    .locals 0

    .line 1
    invoke-super {p0}, Lie3;->Z0()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lnr4;->E(Lg34;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
