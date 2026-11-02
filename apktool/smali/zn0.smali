.class public final Lzn0;
.super Laa7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfo0;


# instance fields
.field public final Y:Lni8;

.field public final Z:Lco0;

.field public final f0:Z

.field public final g0:Lch8;


# direct methods
.method public constructor <init>(Lni8;Lco0;ZLch8;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lzn0;->Y:Lni8;

    .line 11
    .line 12
    iput-object p2, p0, Lzn0;->Z:Lco0;

    .line 13
    .line 14
    iput-boolean p3, p0, Lzn0;->f0:Z

    .line 15
    .line 16
    iput-object p4, p0, Lzn0;->g0:Lch8;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final m0()Lch8;
    .locals 0

    .line 1
    iget-object p0, p0, Lzn0;->g0:Lch8;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n0()Llh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lzn0;->Z:Lco0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lzn0;->f0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final p0(Lz14;)Lt14;
    .locals 3

    .line 1
    new-instance v0, Lzn0;

    .line 2
    .line 3
    iget-object v1, p0, Lzn0;->Y:Lni8;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lni8;->d(Lz14;)Lni8;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-boolean v1, p0, Lzn0;->f0:Z

    .line 10
    .line 11
    iget-object v2, p0, Lzn0;->g0:Lch8;

    .line 12
    .line 13
    iget-object p0, p0, Lzn0;->Z:Lco0;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0, v1, v2}, Lzn0;-><init>(Lni8;Lco0;ZLch8;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final r0(Z)Lmo8;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lzn0;->f0:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lzn0;

    .line 7
    .line 8
    iget-object v1, p0, Lzn0;->Z:Lco0;

    .line 9
    .line 10
    iget-object v2, p0, Lzn0;->g0:Lch8;

    .line 11
    .line 12
    iget-object p0, p0, Lzn0;->Y:Lni8;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1, p1, v2}, Lzn0;-><init>(Lni8;Lco0;ZLch8;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final s0(Lz14;)Lmo8;
    .locals 3

    .line 1
    new-instance v0, Lzn0;

    .line 2
    .line 3
    iget-object v1, p0, Lzn0;->Y:Lni8;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lni8;->d(Lz14;)Lni8;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-boolean v1, p0, Lzn0;->f0:Z

    .line 10
    .line 11
    iget-object v2, p0, Lzn0;->g0:Lch8;

    .line 12
    .line 13
    iget-object p0, p0, Lzn0;->Z:Lco0;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0, v1, v2}, Lzn0;-><init>(Lni8;Lco0;ZLch8;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final bridge synthetic t0(Lch8;)Lmo8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lzn0;->v0(Lch8;)Laa7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Captured("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lzn0;->Y:Lni8;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean p0, p0, Lzn0;->f0:Z

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const-string p0, "?"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, ""

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final u0(Z)Laa7;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lzn0;->f0:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lzn0;

    .line 7
    .line 8
    iget-object v1, p0, Lzn0;->Z:Lco0;

    .line 9
    .line 10
    iget-object v2, p0, Lzn0;->g0:Lch8;

    .line 11
    .line 12
    iget-object p0, p0, Lzn0;->Y:Lni8;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1, p1, v2}, Lzn0;-><init>(Lni8;Lco0;ZLch8;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final v0(Lch8;)Laa7;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzn0;

    .line 5
    .line 6
    iget-object v1, p0, Lzn0;->Z:Lco0;

    .line 7
    .line 8
    iget-boolean v2, p0, Lzn0;->f0:Z

    .line 9
    .line 10
    iget-object p0, p0, Lzn0;->Y:Lni8;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1, v2, p1}, Lzn0;-><init>(Lni8;Lco0;ZLch8;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
