.class public final Lm5;
.super Laq7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic g0:B

.field public final h0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Laq7;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lm5;->g0:B

    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Laq7;-><init>(Laq7;Z)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lq37;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lq37;-><init>(Laq7;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lm5;->h0:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Laq7;Laq7;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lm5;->g0:B

    .line 17
    iput-object p2, p0, Lm5;->h0:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 18
    invoke-direct {p0, p1, p2}, Laq7;-><init>(Laq7;Z)V

    return-void
.end method

.method public constructor <init>(Lw4;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lm5;->g0:B

    .line 15
    invoke-direct {p0}, Laq7;-><init>()V

    .line 16
    iput-object p1, p0, Lm5;->h0:Ljava/lang/Object;

    return-void
.end method

.method private final g()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lm5;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lm5;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Laq7;

    .line 9
    .line 10
    invoke-interface {p0}, Lu85;->b()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lq37;

    .line 15
    .line 16
    invoke-virtual {p0}, Lq37;->b()V

    .line 17
    .line 18
    .line 19
    :pswitch_1
    return-void

    .line 20
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lm5;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lm5;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Laq7;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Lu85;->onError(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lq37;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lq37;->onError(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    new-instance p0, Lka5;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-direct {p0, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lm5;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lm5;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Laq7;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Lu85;->onNext(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lq37;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lq37;->onNext(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p0, Lw4;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lw4;->a(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
