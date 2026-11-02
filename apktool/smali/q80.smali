.class public final Lq80;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lc15;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lc15;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Lr80;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v2, v1}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lq80;->a:Lc15;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ls86;Ls51;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lp80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lp80;

    .line 7
    .line 8
    iget v1, v0, Lp80;->l0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lp80;->l0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp80;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lp80;-><init>(Lq80;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lp80;->j0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lp80;->l0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget p0, v0, Lp80;->i0:I

    .line 35
    .line 36
    iget p1, v0, Lp80;->h0:I

    .line 37
    .line 38
    iget-object v1, v0, Lp80;->g0:[Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v3, v0, Lp80;->f0:Ls86;

    .line 41
    .line 42
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object p2, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Lq80;->a:Lc15;

    .line 58
    .line 59
    iget-object p2, p0, Lc15;->X:[Ljava/lang/Object;

    .line 60
    .line 61
    iget p0, p0, Lc15;->Z:I

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    move-object v6, p2

    .line 65
    move-object p2, p1

    .line 66
    move p1, v1

    .line 67
    move-object v1, v6

    .line 68
    :goto_1
    if-ge p1, p0, :cond_4

    .line 69
    .line 70
    aget-object v3, v1, p1

    .line 71
    .line 72
    check-cast v3, Lr80;

    .line 73
    .line 74
    new-instance v4, Lo7;

    .line 75
    .line 76
    const/16 v5, 0xd

    .line 77
    .line 78
    invoke-direct {v4, p2, v5}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    iput-object p2, v0, Lp80;->f0:Ls86;

    .line 82
    .line 83
    iput-object v1, v0, Lp80;->g0:[Ljava/lang/Object;

    .line 84
    .line 85
    iput p1, v0, Lp80;->h0:I

    .line 86
    .line 87
    iput p0, v0, Lp80;->i0:I

    .line 88
    .line 89
    iput v2, v0, Lp80;->l0:I

    .line 90
    .line 91
    invoke-static {v3, v4, v0}, Lyn0;->s(Lnh1;Ldn2;Ls51;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    sget-object v4, Lc71;->X:Lc71;

    .line 96
    .line 97
    if-ne v3, v4, :cond_3

    .line 98
    .line 99
    return-object v4

    .line 100
    :cond_3
    :goto_2
    add-int/2addr p1, v2

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    sget-object p0, Ldn8;->a:Ldn8;

    .line 103
    .line 104
    return-object p0
.end method
