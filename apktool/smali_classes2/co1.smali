.class public final Lco1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxe2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lh76;


# direct methods
.method public synthetic constructor <init>(Lh76;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lco1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lco1;->Y:Lh76;

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
    iget-byte v0, p0, Lco1;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lco1;->Y:Lh76;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    sget-object v4, Ldn8;->a:Ldn8;

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
    instance-of v0, p2, Luo4;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, Luo4;

    .line 24
    .line 25
    iget v8, v0, Luo4;->g0:I

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
    iput v8, v0, Luo4;->g0:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, Luo4;

    .line 36
    .line 37
    invoke-direct {v0, p0, p2}, Luo4;-><init>(Lco1;Lq51;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, v0, Luo4;->f0:Ljava/lang/Object;

    .line 41
    .line 42
    iget p2, v0, Luo4;->g0:I

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
    move-object v2, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, Ln;

    .line 61
    .line 62
    const/16 p2, 0x15

    .line 63
    .line 64
    invoke-direct {p0, p1, p2}, Ln;-><init>(Lze2;B)V

    .line 65
    .line 66
    .line 67
    iput v7, v0, Luo4;->g0:I

    .line 68
    .line 69
    invoke-virtual {v1, p0, v0}, Lh76;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-object v2, v5

    .line 73
    :goto_1
    return-object v2

    .line 74
    :pswitch_0
    instance-of v0, p2, Lao1;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    move-object v0, p2

    .line 79
    check-cast v0, Lao1;

    .line 80
    .line 81
    iget v8, v0, Lao1;->g0:I

    .line 82
    .line 83
    and-int v9, v8, v6

    .line 84
    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    sub-int/2addr v8, v6

    .line 88
    iput v8, v0, Lao1;->g0:I

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    new-instance v0, Lao1;

    .line 92
    .line 93
    invoke-direct {v0, p0, p2}, Lao1;-><init>(Lco1;Lq51;)V

    .line 94
    .line 95
    .line 96
    :goto_2
    iget-object p0, v0, Lao1;->f0:Ljava/lang/Object;

    .line 97
    .line 98
    iget p2, v0, Lao1;->g0:I

    .line 99
    .line 100
    if-eqz p2, :cond_5

    .line 101
    .line 102
    if-ne p2, v7, :cond_4

    .line 103
    .line 104
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object v2, v4

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance p0, Ln;

    .line 117
    .line 118
    const/4 p2, 0x3

    .line 119
    invoke-direct {p0, p1, p2}, Ln;-><init>(Lze2;B)V

    .line 120
    .line 121
    .line 122
    iput v7, v0, Lao1;->g0:I

    .line 123
    .line 124
    invoke-virtual {v1, p0, v0}, Lh76;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-object v2, v5

    .line 128
    :goto_3
    return-object v2

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
