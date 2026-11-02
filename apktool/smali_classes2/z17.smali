.class public final Lz17;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxe2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lj31;


# direct methods
.method public synthetic constructor <init>(Lj31;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lz17;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lz17;->Y:Lj31;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lze2;Lq51;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Lz17;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lz17;->Y:Lj31;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lc71;->X:Lc71;

    .line 11
    .line 12
    const/high16 v6, -0x80000000

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    instance-of v0, p2, La27;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, La27;

    .line 24
    .line 25
    iget v8, v0, La27;->g0:I

    .line 26
    .line 27
    and-int v9, v8, v6

    .line 28
    .line 29
    if-eqz v9, :cond_0

    .line 30
    .line 31
    sub-int/2addr v8, v6

    .line 32
    iput v8, v0, La27;->g0:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, La27;

    .line 36
    .line 37
    invoke-direct {v0, p0, p2}, La27;-><init>(Lz17;Lq51;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, v0, La27;->f0:Ljava/lang/Object;

    .line 41
    .line 42
    iget p2, v0, La27;->g0:I

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    if-ne p2, v7, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v1, v3

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, Lc27;

    .line 61
    .line 62
    const/4 p2, 0x0

    .line 63
    invoke-direct {p0, p1, p2}, Lc27;-><init>(Lze2;B)V

    .line 64
    .line 65
    .line 66
    iput v7, v0, La27;->g0:I

    .line 67
    .line 68
    invoke-virtual {v2, p0, v0}, Lj31;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v5, :cond_3

    .line 73
    .line 74
    move-object v1, v5

    .line 75
    :cond_3
    :goto_1
    return-object v1

    .line 76
    :pswitch_0
    instance-of v0, p2, Lx17;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    move-object v0, p2

    .line 81
    check-cast v0, Lx17;

    .line 82
    .line 83
    iget v8, v0, Lx17;->g0:I

    .line 84
    .line 85
    and-int v9, v8, v6

    .line 86
    .line 87
    if-eqz v9, :cond_4

    .line 88
    .line 89
    sub-int/2addr v8, v6

    .line 90
    iput v8, v0, Lx17;->g0:I

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    new-instance v0, Lx17;

    .line 94
    .line 95
    invoke-direct {v0, p0, p2}, Lx17;-><init>(Lz17;Lq51;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    iget-object p0, v0, Lx17;->f0:Ljava/lang/Object;

    .line 99
    .line 100
    iget p2, v0, Lx17;->g0:I

    .line 101
    .line 102
    if-eqz p2, :cond_6

    .line 103
    .line 104
    if-ne p2, v7, :cond_5

    .line 105
    .line 106
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    move-object v1, v3

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Ln;

    .line 119
    .line 120
    const/16 p2, 0x1d

    .line 121
    .line 122
    invoke-direct {p0, p1, p2}, Ln;-><init>(Lze2;B)V

    .line 123
    .line 124
    .line 125
    iput v7, v0, Lx17;->g0:I

    .line 126
    .line 127
    invoke-virtual {v2, p0, v0}, Lj31;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-ne p0, v5, :cond_7

    .line 132
    .line 133
    move-object v1, v5

    .line 134
    :cond_7
    :goto_3
    return-object v1

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
