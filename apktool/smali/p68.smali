.class public final Lp68;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lr68;

.field public final synthetic j0:Lmq5;

.field public final synthetic k0:Z


# direct methods
.method public constructor <init>(Lmq5;Lr68;ZLq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lp68;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lp68;->j0:Lmq5;

    .line 5
    .line 6
    iput-object p2, p0, Lp68;->i0:Lr68;

    .line 7
    .line 8
    iput-boolean p3, p0, Lp68;->k0:Z

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lr68;Lmq5;ZLq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lp68;->g0:B

    .line 15
    iput-object p1, p0, Lp68;->i0:Lr68;

    iput-object p2, p0, Lp68;->j0:Lmq5;

    iput-boolean p3, p0, Lp68;->k0:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lp68;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lp68;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lp68;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lp68;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lp68;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lp68;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lp68;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte p2, p0, Lp68;->g0:B

    .line 2
    .line 3
    iget-boolean v0, p0, Lp68;->k0:Z

    .line 4
    .line 5
    iget-object v1, p0, Lp68;->j0:Lmq5;

    .line 6
    .line 7
    iget-object p0, p0, Lp68;->i0:Lr68;

    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p2, Lp68;

    .line 13
    .line 14
    invoke-direct {p2, p0, v1, v0, p1}, Lp68;-><init>(Lr68;Lmq5;ZLq51;)V

    .line 15
    .line 16
    .line 17
    return-object p2

    .line 18
    :pswitch_0
    new-instance p2, Lp68;

    .line 19
    .line 20
    invoke-direct {p2, v1, p0, v0, p1}, Lp68;-><init>(Lmq5;Lr68;ZLq51;)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lp68;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-boolean v2, p0, Lp68;->k0:Z

    .line 6
    .line 7
    iget-object v3, p0, Lp68;->j0:Lmq5;

    .line 8
    .line 9
    iget-object v4, p0, Lp68;->i0:Lr68;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    sget-object v6, Lc71;->X:Lc71;

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lp68;->h0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v7, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v1, v8

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-boolean v7, p0, Lp68;->h0:Z

    .line 39
    .line 40
    invoke-virtual {v4, v3, v2, p0}, Lr68;->g(Lmq5;ZLs51;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-ne p0, v6, :cond_2

    .line 45
    .line 46
    move-object v1, v6

    .line 47
    :cond_2
    :goto_0
    return-object v1

    .line 48
    :pswitch_0
    iget-boolean v0, p0, Lp68;->h0:Z

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    if-ne v0, v7, :cond_3

    .line 53
    .line 54
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object v1, v8

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Lh70;

    .line 67
    .line 68
    const/4 v0, 0x7

    .line 69
    invoke-direct {p1, v4, v2, v0}, Lh70;-><init>(Ljava/lang/Object;ZB)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Ln30;

    .line 73
    .line 74
    const/4 v2, 0x6

    .line 75
    invoke-direct {v0, v4, v2}, Ln30;-><init>(Lr68;B)V

    .line 76
    .line 77
    .line 78
    iput-boolean v7, p0, Lp68;->h0:Z

    .line 79
    .line 80
    new-instance v2, Lat5;

    .line 81
    .line 82
    invoke-direct {v2, p1, v0, v8}, Lat5;-><init>(Lh70;Ln30;Lq51;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v3, v2, p0}, Lmb6;->i(Lmq5;Lrn2;Lq51;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, v6, :cond_5

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    move-object p0, v1

    .line 93
    :goto_1
    if-ne p0, v6, :cond_6

    .line 94
    .line 95
    move-object v1, v6

    .line 96
    :cond_6
    :goto_2
    return-object v1

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
