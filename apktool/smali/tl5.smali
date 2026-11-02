.class public final Ltl5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/Iterator;
.implements Lqv3;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lfu8;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, Ltl5;->X:B

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iget-object p1, p1, Lfu8;->l0:Ljava/util/ArrayList;

    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ltl5;->Y:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Ljl5;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Ltl5;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    new-array v1, v0, [Lkf8;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_0

    .line 13
    .line 14
    new-instance v3, Lof8;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lof8;-><init>(Ltl5;)V

    .line 17
    .line 18
    .line 19
    aput-object v3, v1, v2

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Lql5;

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lql5;-><init>(Ljl5;[Lkf8;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Ltl5;->Y:Ljava/util/Iterator;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lol5;)V
    .locals 4

    const/4 v0, 0x0

    iput-byte v0, p0, Ltl5;->X:B

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x8

    .line 36
    new-array v2, v1, [Lkf8;

    :goto_0
    if-ge v0, v1, :cond_0

    .line 37
    new-instance v3, Lnf8;

    invoke-direct {v3, p0}, Lnf8;-><init>(Ltl5;)V

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Lpl5;

    invoke-direct {v0, p1, v2}, Lpl5;-><init>(Lol5;[Lkf8;)V

    iput-object v0, p0, Ltl5;->Y:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Ltl5;->X:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Lw1;

    invoke-direct {v0, p1}, Lw1;-><init>([Ljava/lang/Object;)V

    .line 34
    iput-object v0, p0, Ltl5;->Y:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Ltl5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ltl5;->Y:Ljava/util/Iterator;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    check-cast p0, Lw1;

    .line 14
    .line 15
    invoke-virtual {p0}, Lw1;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_1
    check-cast p0, Lql5;

    .line 21
    .line 22
    iget-boolean p0, p0, Lnl5;->Z:Z

    .line 23
    .line 24
    return p0

    .line 25
    :pswitch_2
    check-cast p0, Lpl5;

    .line 26
    .line 27
    iget-boolean p0, p0, Lnl5;->Z:Z

    .line 28
    .line 29
    return p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Ltl5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ltl5;->Y:Ljava/util/Iterator;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lhu8;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, Lw1;

    .line 16
    .line 17
    invoke-virtual {p0}, Lw1;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_1
    check-cast p0, Lql5;

    .line 23
    .line 24
    invoke-virtual {p0}, Lql5;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/util/Map$Entry;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_2
    check-cast p0, Lpl5;

    .line 32
    .line 33
    invoke-virtual {p0}, Lpl5;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/util/Map$Entry;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget-byte v0, p0, Ltl5;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p0

    .line 20
    :pswitch_1
    iget-object p0, p0, Ltl5;->Y:Ljava/util/Iterator;

    .line 21
    .line 22
    check-cast p0, Lql5;

    .line 23
    .line 24
    invoke-virtual {p0}, Lql5;->remove()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_2
    iget-object p0, p0, Ltl5;->Y:Ljava/util/Iterator;

    .line 29
    .line 30
    check-cast p0, Lpl5;

    .line 31
    .line 32
    invoke-virtual {p0}, Lpl5;->remove()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
