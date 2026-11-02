.class public final Lim5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/Iterator;
.implements Lqv3;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljm5;


# direct methods
.method public constructor <init>(Ldm5;B)V
    .locals 2

    .line 1
    iput-byte p2, p0, Lim5;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p2, Ljm5;

    .line 11
    .line 12
    iget-object v1, p1, Ldm5;->X:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p1, p1, Ldm5;->Z:Lll5;

    .line 15
    .line 16
    invoke-direct {p2, v1, p1, v0}, Ljm5;-><init>(Ljava/lang/Object;Ljava/util/Map;B)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lim5;->Y:Ljm5;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p2, Ljm5;

    .line 26
    .line 27
    iget-object v1, p1, Ldm5;->X:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p1, p1, Ldm5;->Z:Lll5;

    .line 30
    .line 31
    invoke-direct {p2, v1, p1, v0}, Ljm5;-><init>(Ljava/lang/Object;Ljava/util/Map;B)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lim5;->Y:Ljm5;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance p2, Ljm5;

    .line 41
    .line 42
    iget-object v1, p1, Ldm5;->X:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object p1, p1, Ldm5;->Z:Lll5;

    .line 45
    .line 46
    invoke-direct {p2, v1, p1, v0}, Ljm5;-><init>(Ljava/lang/Object;Ljava/util/Map;B)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, Lim5;->Y:Ljm5;

    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Lim5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lim5;->Y:Ljm5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljm5;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p0}, Ljm5;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :pswitch_1
    invoke-virtual {p0}, Ljm5;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Lim5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lim5;->Y:Ljm5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljm5;->a()Lza4;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object p0, p0, Lza4;->a:Ljava/lang/Object;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object v0, p0, Ljm5;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljm5;->a()Lza4;

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_1
    iget-object v0, p0, Ljm5;->Y:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljm5;->a()Lza4;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object p0, p0, Lza4;->a:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v1, Lmp4;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, v0, p0, v2}, Lmp4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget-byte p0, p0, Lim5;->X:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

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
    const-string v0, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :pswitch_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v0, "Operation is not supported for read-only collection"

    .line 25
    .line 26
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
