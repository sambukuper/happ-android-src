.class public final Lzi3;
.super Lba7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final s0:Ldh8;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 9

    .line 1
    invoke-static {p5}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v6, p6

    .line 11
    move-object/from16 v7, p7

    .line 12
    .line 13
    move/from16 v8, p8

    .line 14
    .line 15
    invoke-direct/range {v0 .. v8}, Ldh8;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 16
    .line 17
    .line 18
    iput-object p5, p0, Lzi3;->s0:Ldh8;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final A0(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-object p0, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p0, p1, v0}, Ldh8;->u0(Ljava/lang/Class;Ljava/lang/StringBuilder;Z)V

    .line 5
    .line 6
    .line 7
    return-object p1
.end method

.method public final B0(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, Ldh8;->u0(Ljava/lang/Class;Ljava/lang/StringBuilder;Z)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x3c

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lzi3;->s0:Ldh8;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ldh8;->B0(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, ">;"

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final M0(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;)Ldh8;
    .locals 9

    .line 1
    new-instance v0, Lzi3;

    .line 2
    .line 3
    iget-object v7, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean v8, p0, Ldh8;->n0:Z

    .line 6
    .line 7
    iget-object v2, p0, Ldh8;->q0:Lgh8;

    .line 8
    .line 9
    iget-object v5, p0, Lzi3;->s0:Ldh8;

    .line 10
    .line 11
    iget-object v6, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    move-object v3, p3

    .line 15
    move-object v4, p4

    .line 16
    invoke-direct/range {v0 .. v8}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final O0(Ldh8;)Ldh8;
    .locals 10

    .line 1
    iget-object v0, p0, Lzi3;->s0:Ldh8;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v1, Lzi3;

    .line 7
    .line 8
    iget-object v8, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean v9, p0, Ldh8;->n0:Z

    .line 11
    .line 12
    iget-object v2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 13
    .line 14
    iget-object v3, p0, Ldh8;->q0:Lgh8;

    .line 15
    .line 16
    iget-object v4, p0, Ldh8;->o0:Ldh8;

    .line 17
    .line 18
    iget-object v5, p0, Ldh8;->p0:[Ldh8;

    .line 19
    .line 20
    iget-object v7, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v6, p1

    .line 23
    invoke-direct/range {v1 .. v9}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final P0(Lsi8;)Ldh8;
    .locals 11

    .line 1
    iget-object v0, p0, Lzi3;->s0:Ldh8;

    .line 2
    .line 3
    iget-object v1, v0, Ldh8;->m0:Ljava/lang/Object;

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v2, Lzi3;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ldh8;->S0(Ljava/lang/Object;)Ldh8;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    iget-object v9, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 15
    .line 16
    iget-boolean v10, p0, Ldh8;->n0:Z

    .line 17
    .line 18
    iget-object v3, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 19
    .line 20
    iget-object v4, p0, Ldh8;->q0:Lgh8;

    .line 21
    .line 22
    iget-object v5, p0, Ldh8;->o0:Ldh8;

    .line 23
    .line 24
    iget-object v6, p0, Ldh8;->p0:[Ldh8;

    .line 25
    .line 26
    iget-object v8, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct/range {v2 .. v10}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 29
    .line 30
    .line 31
    return-object v2
.end method

.method public final bridge synthetic R0()Ldh8;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzi3;->Y0()Lzi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0(Ljava/lang/Object;)Ldh8;
    .locals 10

    .line 1
    iget-object v0, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v1, Lzi3;

    .line 7
    .line 8
    iget-object v7, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean v9, p0, Ldh8;->n0:Z

    .line 11
    .line 12
    iget-object v2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 13
    .line 14
    iget-object v3, p0, Ldh8;->q0:Lgh8;

    .line 15
    .line 16
    iget-object v4, p0, Ldh8;->o0:Ldh8;

    .line 17
    .line 18
    iget-object v5, p0, Ldh8;->p0:[Ldh8;

    .line 19
    .line 20
    iget-object v6, p0, Lzi3;->s0:Ldh8;

    .line 21
    .line 22
    move-object v8, p1

    .line 23
    invoke-direct/range {v1 .. v9}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final T0(Ljava/lang/Object;)Ldh8;
    .locals 10

    .line 1
    iget-object v0, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v1, Lzi3;

    .line 7
    .line 8
    iget-object v8, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean v9, p0, Ldh8;->n0:Z

    .line 11
    .line 12
    iget-object v2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 13
    .line 14
    iget-object v3, p0, Ldh8;->q0:Lgh8;

    .line 15
    .line 16
    iget-object v4, p0, Ldh8;->o0:Ldh8;

    .line 17
    .line 18
    iget-object v5, p0, Ldh8;->p0:[Ldh8;

    .line 19
    .line 20
    iget-object v6, p0, Lzi3;->s0:Ldh8;

    .line 21
    .line 22
    move-object v7, p1

    .line 23
    invoke-direct/range {v1 .. v9}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final bridge synthetic V0()Lba7;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzi3;->Y0()Lzi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final W0(Ljava/lang/Object;)Lba7;
    .locals 10

    .line 1
    iget-object v0, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v1, Lzi3;

    .line 7
    .line 8
    iget-object v7, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean v9, p0, Ldh8;->n0:Z

    .line 11
    .line 12
    iget-object v2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 13
    .line 14
    iget-object v3, p0, Ldh8;->q0:Lgh8;

    .line 15
    .line 16
    iget-object v4, p0, Ldh8;->o0:Ldh8;

    .line 17
    .line 18
    iget-object v5, p0, Ldh8;->p0:[Ldh8;

    .line 19
    .line 20
    iget-object v6, p0, Lzi3;->s0:Ldh8;

    .line 21
    .line 22
    move-object v8, p1

    .line 23
    invoke-direct/range {v1 .. v9}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final X0(Ljava/lang/Object;)Lba7;
    .locals 10

    .line 1
    iget-object v0, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v1, Lzi3;

    .line 7
    .line 8
    iget-object v8, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean v9, p0, Ldh8;->n0:Z

    .line 11
    .line 12
    iget-object v2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 13
    .line 14
    iget-object v3, p0, Ldh8;->q0:Lgh8;

    .line 15
    .line 16
    iget-object v4, p0, Ldh8;->o0:Ldh8;

    .line 17
    .line 18
    iget-object v5, p0, Ldh8;->p0:[Ldh8;

    .line 19
    .line 20
    iget-object v6, p0, Lzi3;->s0:Ldh8;

    .line 21
    .line 22
    move-object v7, p1

    .line 23
    invoke-direct/range {v1 .. v9}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final Y0()Lzi3;
    .locals 10

    .line 1
    iget-boolean v0, p0, Ldh8;->n0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v1, Lzi3;

    .line 7
    .line 8
    iget-object v0, p0, Lzi3;->s0:Ldh8;

    .line 9
    .line 10
    invoke-virtual {v0}, Ldh8;->R0()Ldh8;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    iget-object v8, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 18
    .line 19
    iget-object v3, p0, Ldh8;->q0:Lgh8;

    .line 20
    .line 21
    iget-object v4, p0, Ldh8;->o0:Ldh8;

    .line 22
    .line 23
    iget-object v5, p0, Ldh8;->p0:[Ldh8;

    .line 24
    .line 25
    iget-object v7, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-direct/range {v1 .. v9}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method

.method public final w0()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lzi3;->s0:Ldh8;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {p0, v2}, Ldh8;->v0(I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/16 p0, 0x3c

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ldh8;->N0()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 p0, 0x3e

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public final z0()Ldh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lzi3;->s0:Ldh8;

    .line 2
    .line 3
    return-object p0
.end method
