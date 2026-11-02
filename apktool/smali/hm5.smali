.class public final Lhm5;
.super Lz2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lc83;


# instance fields
.field public final synthetic X:B

.field public final Y:Ldm5;


# direct methods
.method public synthetic constructor <init>(Ldm5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lhm5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lhm5;->Y:Ldm5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-byte v0, p0, Lhm5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lhm5;->Y:Ldm5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldm5;->Z:Lll5;

    .line 9
    .line 10
    invoke-virtual {p0}, Lll5;->c()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Ldm5;->Z:Lll5;

    .line 16
    .line 17
    invoke-virtual {p0}, Lll5;->c()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-byte v0, p0, Lhm5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lhm5;->Y:Ldm5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldm5;->Z:Lll5;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lll5;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lz39;->n(Ljava/util/Map;Ljava/util/Map$Entry;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    :goto_0
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-byte v0, p0, Lhm5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lhm5;->Y:Ldm5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lim5;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, v1}, Lim5;-><init>(Ldm5;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, Lim5;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, Lim5;-><init>(Ldm5;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
