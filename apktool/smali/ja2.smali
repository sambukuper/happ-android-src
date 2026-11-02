.class public final Lja2;
.super Lf50;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic t0:B

.field public final u0:Lf50;

.field public final v0:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Lf50;Ljava/io/Serializable;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lja2;->t0:B

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lf50;-><init>(Lf50;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lja2;->u0:Lf50;

    .line 7
    .line 8
    iput-object p2, p0, Lja2;->v0:Ljava/io/Serializable;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final f(Lar3;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lja2;->t0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lja2;->u0:Lf50;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lf50;->f(Lar3;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p0, p0, Lja2;->u0:Lf50;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lf50;->f(Lar3;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lar3;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lja2;->t0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lja2;->u0:Lf50;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lf50;->g(Lar3;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p0, p0, Lja2;->u0:Lf50;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lf50;->g(Lar3;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lc25;)Lf50;
    .locals 2

    .line 1
    iget-byte v0, p0, Lja2;->t0:B

    .line 2
    .line 3
    iget-object v1, p0, Lja2;->v0:Ljava/io/Serializable;

    .line 4
    .line 5
    iget-object p0, p0, Lja2;->u0:Lf50;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Lja2;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lf50;->i(Lc25;)Lf50;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast v1, Ljava/lang/Class;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-direct {v0, p0, v1, p1}, Lja2;-><init>(Lf50;Ljava/io/Serializable;B)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, Lja2;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lf50;->i(Lc25;)Lf50;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast v1, [Ljava/lang/Class;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-direct {v0, p0, v1, p1}, Lja2;-><init>(Lf50;Ljava/io/Serializable;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lja2;->t0:B

    .line 2
    .line 3
    iget-object p0, p0, Lja2;->u0:Lf50;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lf50;->j(Ljava/lang/Object;Lro3;Lt37;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lf50;->j(Ljava/lang/Object;Lro3;Lt37;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lja2;->t0:B

    .line 2
    .line 3
    iget-object p0, p0, Lja2;->u0:Lf50;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lf50;->k(Ljava/lang/Object;Lro3;Lt37;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lf50;->k(Ljava/lang/Object;Lro3;Lt37;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
