.class public final Lt76;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lv76;

.field public final synthetic j0:Lv63;


# direct methods
.method public synthetic constructor <init>(Lv76;Lv63;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lt76;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lt76;->i0:Lv76;

    .line 4
    .line 5
    iput-object p2, p0, Lt76;->j0:Lv63;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lt76;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lt76;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lt76;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lt76;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lt76;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lt76;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lt76;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte p2, p0, Lt76;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Lt76;->j0:Lv63;

    .line 4
    .line 5
    iget-object p0, p0, Lt76;->i0:Lv76;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p2, Lt76;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p2, p0, v0, p1, v1}, Lt76;-><init>(Lv76;Lv63;Lq51;B)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Lt76;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p2, p0, v0, p1, v1}, Lt76;-><init>(Lv76;Lv63;Lq51;B)V

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
    .locals 7

    .line 1
    iget-byte v0, p0, Lt76;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lt76;->j0:Lv63;

    .line 4
    .line 5
    iget-object v2, p0, Lt76;->i0:Lv76;

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
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lt76;->h0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v6, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-boolean v6, p0, Lt76;->h0:Z

    .line 35
    .line 36
    sget p1, Lv76;->f:I

    .line 37
    .line 38
    invoke-virtual {v2, v1, v6, p0}, Lv76;->a(Lv63;ILs51;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v5, :cond_2

    .line 43
    .line 44
    move-object p1, v5

    .line 45
    :cond_2
    :goto_0
    return-object p1

    .line 46
    :pswitch_0
    iget-boolean v0, p0, Lt76;->h0:Z

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    if-ne v0, v6, :cond_3

    .line 51
    .line 52
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v3

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-boolean v6, p0, Lt76;->h0:Z

    .line 65
    .line 66
    sget p1, Lv76;->f:I

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-virtual {v2, v1, p1, p0}, Lv76;->a(Lv63;ILs51;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v5, :cond_5

    .line 74
    .line 75
    move-object p1, v5

    .line 76
    :cond_5
    :goto_1
    return-object p1

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
