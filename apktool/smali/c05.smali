.class public final Lc05;
.super Lmp4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final f0:Ltl5;

.field public g0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ltl5;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, p3, v0}, Lmp4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lc05;->f0:Ltl5;

    .line 6
    .line 7
    iput-object p3, p0, Lc05;->g0:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lc05;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lc05;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p1, p0, Lc05;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lc05;->f0:Ltl5;

    .line 6
    .line 7
    iget-object v1, v1, Ltl5;->Y:Ljava/util/Iterator;

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lpl5;

    .line 11
    .line 12
    iget-object v1, v2, Lpl5;->g0:Lol5;

    .line 13
    .line 14
    iget-object p0, p0, Lmp4;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lol5;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    iget-boolean v3, v2, Lnl5;->Z:Z

    .line 24
    .line 25
    if-eqz v3, :cond_3

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    iget-object v3, v2, Lnl5;->f0:[Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, [Lkf8;

    .line 32
    .line 33
    iget v4, v2, Lnl5;->Y:I

    .line 34
    .line 35
    aget-object v3, v3, v4

    .line 36
    .line 37
    iget-object v4, v3, Lkf8;->Y:[Ljava/lang/Object;

    .line 38
    .line 39
    iget v3, v3, Lkf8;->f0:I

    .line 40
    .line 41
    aget-object v5, v4, v3

    .line 42
    .line 43
    invoke-virtual {v1, p0, p1}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    :goto_0
    move v3, p0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 p0, 0x0

    .line 55
    goto :goto_0

    .line 56
    :goto_1
    iget-object v4, v1, Lol5;->Z:Lif8;

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    invoke-virtual/range {v2 .. v8}, Lpl5;->f(ILif8;Ljava/lang/Object;IIZ)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-static {}, Lbt;->n()V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    return-object p0

    .line 70
    :cond_3
    invoke-virtual {v1, p0, p1}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :goto_2
    iget p0, v1, Lol5;->g0:I

    .line 74
    .line 75
    iput p0, v2, Lpl5;->j0:I

    .line 76
    .line 77
    return-object v0
.end method
