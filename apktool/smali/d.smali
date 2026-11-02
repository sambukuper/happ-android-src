.class public final Ld;
.super Lqj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Z:B

.field public f0:Ljava/lang/Object;

.field public g0:Z

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldn2;Lq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Ld;->Z:B

    .line 13
    iput-object p1, p0, Ld;->i0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lqj6;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Ls92;Loi5;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Ld;->Z:B

    .line 3
    .line 4
    iput-object p1, p0, Ld;->h0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ld;->i0:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Lqj6;-><init>(ILq51;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Ld;->Z:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lv27;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Ld;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ld;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ld;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ld;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ld;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ld;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Ld;->Z:B

    .line 2
    .line 3
    iget-object v1, p0, Ld;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Ld;

    .line 9
    .line 10
    check-cast v1, Ldn2;

    .line 11
    .line 12
    invoke-direct {p0, v1, p1}, Ld;-><init>(Ldn2;Lq51;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Ld;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance v0, Ld;

    .line 19
    .line 20
    iget-object p0, p0, Ld;->h0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ls92;

    .line 23
    .line 24
    check-cast v1, Loi5;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p1}, Ld;-><init>(Ls92;Loi5;Lq51;)V

    .line 27
    .line 28
    .line 29
    iput-object p2, v0, Ld;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Ld;->Z:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Ld;->i0:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lc71;->X:Lc71;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Ld;->g0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v5, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Ld;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v3, p0, Ld;->h0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lv27;

    .line 27
    .line 28
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v1, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Ld;->h0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lv27;

    .line 43
    .line 44
    move-object v3, p1

    .line 45
    :cond_2
    move-object p1, v2

    .line 46
    check-cast p1, Ldn2;

    .line 47
    .line 48
    invoke-interface {p1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iput-object v3, p0, Ld;->h0:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object p1, p0, Ld;->f0:Ljava/lang/Object;

    .line 57
    .line 58
    iput-boolean v5, p0, Ld;->g0:Z

    .line 59
    .line 60
    invoke-virtual {v3, p0, p1}, Lv27;->b(Lq51;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v1, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move-object v0, v6

    .line 66
    :goto_0
    if-nez v0, :cond_2

    .line 67
    .line 68
    :goto_1
    return-object v1

    .line 69
    :pswitch_0
    iget-boolean v0, p0, Ld;->g0:Z

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    if-ne v0, v5, :cond_4

    .line 74
    .line 75
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    move-object v1, v6

    .line 83
    goto :goto_2

    .line 84
    :cond_5
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Ld;->f0:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v6, p1

    .line 90
    check-cast v6, Lv27;

    .line 91
    .line 92
    iget-object p1, p0, Ld;->h0:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v7, p1

    .line 95
    check-cast v7, Ls92;

    .line 96
    .line 97
    new-instance v8, Lkt;

    .line 98
    .line 99
    invoke-direct {v8}, Lkt;-><init>()V

    .line 100
    .line 101
    .line 102
    move-object v9, v2

    .line 103
    check-cast v9, Loi5;

    .line 104
    .line 105
    iput-boolean v5, p0, Ld;->g0:Z

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v11, 0x1

    .line 109
    move-object v12, p0

    .line 110
    invoke-static/range {v6 .. v12}, Ljm4;->u(Lv27;Ls92;Lkt;Loi5;ZZLr10;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v4, :cond_6

    .line 115
    .line 116
    move-object v1, v4

    .line 117
    :cond_6
    :goto_2
    return-object v1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
