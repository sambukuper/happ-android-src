.class public final Lz64;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lj74;

.field public final b:Ly64;

.field public final c:Lk44;

.field public final d:Lne;


# direct methods
.method public constructor <init>(Lj74;Ly64;Lk44;Lne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz64;->a:Lj74;

    .line 5
    .line 6
    iput-object p2, p0, Lz64;->b:Ly64;

    .line 7
    .line 8
    iput-object p3, p0, Lz64;->c:Lk44;

    .line 9
    .line 10
    iput-object p4, p0, Lz64;->d:Lne;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Llp2;I)V
    .locals 10

    .line 1
    const v0, -0x1b900aca

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p1}, Llp2;->d(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p4

    .line 17
    invoke-virtual {p3, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    invoke-virtual {p3, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x100

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    and-int/lit16 v1, v0, 0x93

    .line 42
    .line 43
    const/16 v2, 0x92

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eq v1, v2, :cond_3

    .line 47
    .line 48
    move v1, v3

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/4 v1, 0x0

    .line 51
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p3, v2, v1}, Llp2;->N(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    iget-object v1, p0, Lz64;->a:Lj74;

    .line 60
    .line 61
    iget-object v6, v1, Lj74;->u0:Lm64;

    .line 62
    .line 63
    new-instance v1, Lgx2;

    .line 64
    .line 65
    invoke-direct {v1, p0, p1, v3}, Lgx2;-><init>(Ljava/lang/Object;IB)V

    .line 66
    .line 67
    .line 68
    const v2, -0x3128503e

    .line 69
    .line 70
    .line 71
    invoke-static {v2, v1, p3}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    shr-int/lit8 v1, v0, 0x3

    .line 76
    .line 77
    and-int/lit8 v1, v1, 0xe

    .line 78
    .line 79
    or-int/lit16 v1, v1, 0xc00

    .line 80
    .line 81
    shl-int/lit8 v0, v0, 0x3

    .line 82
    .line 83
    and-int/lit8 v0, v0, 0x70

    .line 84
    .line 85
    or-int v9, v1, v0

    .line 86
    .line 87
    move v5, p1

    .line 88
    move-object v4, p2

    .line 89
    move-object v8, p3

    .line 90
    invoke-static/range {v4 .. v9}, Lvj8;->k(Ljava/lang/Object;ILm64;Lzy0;Llp2;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_4
    move v5, p1

    .line 95
    move-object v4, p2

    .line 96
    move-object v8, p3

    .line 97
    invoke-virtual {v8}, Llp2;->Q()V

    .line 98
    .line 99
    .line 100
    :goto_4
    invoke-virtual {v8}, Llp2;->r()Lj86;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    new-instance p2, Lg64;

    .line 107
    .line 108
    invoke-direct {p2, p0, v5, v4, p4}, Lg64;-><init>(Lz64;ILjava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    iput-object p2, p1, Lj86;->d:Lrn2;

    .line 112
    .line 113
    :cond_5
    return-void
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lz64;->b:Ly64;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly64;->a:Lne;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lne;->d(I)Lrg3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget v0, p0, Lrg3;->a:I

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iget-object p0, p0, Lrg3;->c:Lf63;

    .line 16
    .line 17
    iget-object p0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lgn2;

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget-object p0, p0, Lz64;->b:Ly64;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly64;->a:Lne;

    .line 7
    .line 8
    iget p0, p0, Lne;->b:I

    .line 9
    .line 10
    return p0
.end method

.method public final d(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz64;->d:Lne;

    .line 2
    .line 3
    iget-object v1, v0, Lne;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Lne;->b:I

    .line 8
    .line 9
    sub-int v0, p1, v0

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-ge v0, v2, :cond_0

    .line 15
    .line 16
    aget-object v0, v1, v0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-nez v0, :cond_3

    .line 21
    .line 22
    iget-object p0, p0, Lz64;->b:Ly64;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Ly64;->a:Lne;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lne;->d(I)Lrg3;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget v0, p0, Lrg3;->a:I

    .line 34
    .line 35
    sub-int v0, p1, v0

    .line 36
    .line 37
    iget-object p0, p0, Lrg3;->c:Lf63;

    .line 38
    .line 39
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lgn2;

    .line 42
    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    return-object p0

    .line 57
    :cond_2
    :goto_1
    new-instance p0, Lgf1;

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lgf1;-><init>(I)V

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lz64;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lz64;

    .line 12
    .line 13
    iget-object p1, p1, Lz64;->b:Ly64;

    .line 14
    .line 15
    iget-object p0, p0, Lz64;->b:Ly64;

    .line 16
    .line 17
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lz64;->b:Ly64;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
