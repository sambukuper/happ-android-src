.class public final Lfa7;
.super Lyh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lej8;


# instance fields
.field public final Y:Laa7;

.field public final Z:Lt14;


# direct methods
.method public constructor <init>(Laa7;Lt14;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfa7;->Y:Laa7;

    .line 8
    .line 9
    iput-object p2, p0, Lfa7;->Z:Lt14;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final B()Lt14;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa7;->Z:Lt14;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOrigin()Lmo8;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa7;->Y:Laa7;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic p0(Lz14;)Lt14;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfa7;->z0(Lz14;)Lfa7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge synthetic s0(Lz14;)Lmo8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfa7;->z0(Lz14;)Lfa7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge synthetic t0(Lch8;)Lmo8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfa7;->v0(Lch8;)Laa7;

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
    const-string v1, "[@EnhancedForWarnings("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lfa7;->Z:Lt14;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ")] "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lfa7;->Y:Laa7;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final u0(Z)Laa7;
    .locals 1

    .line 1
    iget-object v0, p0, Lfa7;->Y:Laa7;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Laa7;->u0(Z)Laa7;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lfa7;->Z:Lt14;

    .line 8
    .line 9
    invoke-virtual {p0}, Lt14;->q0()Lmo8;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Lmo8;->r0(Z)Lmo8;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {v0, p0}, Lc18;->h(Lmo8;Lt14;)Lmo8;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p0, Laa7;

    .line 25
    .line 26
    return-object p0
.end method

.method public final v0(Lch8;)Laa7;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfa7;->Y:Laa7;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Laa7;->v0(Lch8;)Laa7;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, Lfa7;->Z:Lt14;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lc18;->h(Lmo8;Lt14;)Lmo8;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast p0, Laa7;

    .line 20
    .line 21
    return-object p0
.end method

.method public final w0()Laa7;
    .locals 0

    .line 1
    iget-object p0, p0, Lfa7;->Y:Laa7;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic x0(Lz14;)Laa7;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfa7;->z0(Lz14;)Lfa7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final y0(Laa7;)Lyh1;
    .locals 1

    .line 1
    new-instance v0, Lfa7;

    .line 2
    .line 3
    iget-object p0, p0, Lfa7;->Z:Lt14;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lfa7;-><init>(Laa7;Lt14;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final z0(Lz14;)Lfa7;
    .locals 1

    .line 1
    new-instance p1, Lfa7;

    .line 2
    .line 3
    iget-object v0, p0, Lfa7;->Z:Lt14;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lfa7;->Y:Laa7;

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Lfa7;-><init>(Laa7;Lt14;)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method
