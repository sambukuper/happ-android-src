.class public final Lz74;
.super Lt14;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final Y:Lve4;

.field public final Z:Ldn2;

.field public final f0:Lte4;


# direct methods
.method public constructor <init>(Lve4;Ldn2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz74;->Y:Lve4;

    .line 5
    .line 6
    iput-object p2, p0, Lz74;->Z:Ldn2;

    .line 7
    .line 8
    new-instance v0, Lte4;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lz74;->f0:Lte4;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final K()Let4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz74;->r0()Lt14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lt14;->K()Let4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final l0()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz74;->r0()Lt14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lt14;->l0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final m0()Lch8;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz74;->r0()Lt14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lt14;->m0()Lch8;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final n0()Llh8;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz74;->r0()Lt14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final o0()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz74;->r0()Lt14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lt14;->o0()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final p0(Lz14;)Lt14;
    .locals 3

    .line 1
    new-instance v0, Lz74;

    .line 2
    .line 3
    new-instance v1, Lzk3;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v1, p1, p0, v2}, Lzk3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lz74;->Y:Lve4;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lz74;-><init>(Lve4;Ldn2;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final q0()Lmo8;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz74;->r0()Lt14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    instance-of v0, p0, Lz74;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lz74;

    .line 10
    .line 11
    invoke-virtual {p0}, Lz74;->r0()Lt14;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast p0, Lmo8;

    .line 20
    .line 21
    return-object p0
.end method

.method public final r0()Lt14;
    .locals 0

    .line 1
    iget-object p0, p0, Lz74;->f0:Lte4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lt14;

    .line 8
    .line 9
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lz74;->f0:Lte4;

    .line 2
    .line 3
    iget-object v1, v0, Lse4;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v2, Lue4;->X:Lue4;

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lse4;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v1, Lue4;->Y:Lue4;

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lz74;->r0()Lt14;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string p0, "<Not computed yet>"

    .line 25
    .line 26
    return-object p0
.end method
