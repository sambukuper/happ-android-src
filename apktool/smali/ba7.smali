.class public Lba7;
.super Ldh8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 2

    .line 23
    sget-object v0, Lgh8;->i0:Lgh8;

    const/4 v1, 0x0

    .line 24
    invoke-direct {p0, p1, v0, v1, v1}, Lba7;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 25
    invoke-direct/range {v0 .. v7}, Lba7;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 10

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object v0, Lgh8;->i0:Lgh8;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move-object v0, p2

    .line 7
    :goto_0
    iget v6, v0, Lgh8;->f0:I

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v5, p4

    .line 14
    move-object v7, p5

    .line 15
    move-object/from16 v8, p6

    .line 16
    .line 17
    move/from16 v9, p7

    .line 18
    .line 19
    invoke-direct/range {v1 .. v9}, Ldh8;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static U0(Ljava/lang/Class;)Lba7;
    .locals 8

    .line 1
    new-instance v0, Lba7;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    move-object v1, p0

    .line 10
    invoke-direct/range {v0 .. v7}, Lba7;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public A0(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
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

.method public B0(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

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
    iget-object p0, p0, Ldh8;->q0:Lgh8;

    .line 8
    .line 9
    iget-object v0, p0, Lgh8;->Y:[Ldh8;

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    const/16 v2, 0x3c

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :goto_0
    if-ge v1, v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lgh8;->d(I)Ldh8;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2, p1}, Ldh8;->B0(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 p0, 0x3e

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_1
    const/16 p0, 0x3b

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method public final I0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public M0(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;)Ldh8;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public O0(Ldh8;)Ldh8;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    const-string p1, "Simple types have no content types; cannot call withContentType()"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public P0(Lsi8;)Ldh8;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    const-string p1, "Simple types have no content types; cannot call withContenTypeHandler()"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public bridge synthetic R0()Ldh8;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lba7;->V0()Lba7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic S0(Ljava/lang/Object;)Ldh8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lba7;->W0(Ljava/lang/Object;)Lba7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic T0(Ljava/lang/Object;)Ldh8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lba7;->X0(Ljava/lang/Object;)Lba7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public V0()Lba7;
    .locals 9

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
    new-instance v1, Lba7;

    .line 7
    .line 8
    iget-object v7, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v8, 0x1

    .line 11
    iget-object v2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 12
    .line 13
    iget-object v3, p0, Ldh8;->q0:Lgh8;

    .line 14
    .line 15
    iget-object v4, p0, Ldh8;->o0:Ldh8;

    .line 16
    .line 17
    iget-object v5, p0, Ldh8;->p0:[Ldh8;

    .line 18
    .line 19
    iget-object v6, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct/range {v1 .. v8}, Lba7;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public W0(Ljava/lang/Object;)Lba7;
    .locals 9

    .line 1
    iget-object v0, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v1, Lba7;

    .line 7
    .line 8
    iget-object v6, p0, Ldh8;->l0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean v8, p0, Ldh8;->n0:Z

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
    move-object v7, p1

    .line 21
    invoke-direct/range {v1 .. v8}, Lba7;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public X0(Ljava/lang/Object;)Lba7;
    .locals 9

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
    new-instance v1, Lba7;

    .line 7
    .line 8
    iget-object v7, p0, Ldh8;->m0:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean v8, p0, Ldh8;->n0:Z

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
    move-object v6, p1

    .line 21
    invoke-direct/range {v1 .. v8}, Lba7;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v0

    .line 9
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    check-cast p1, Lba7;

    .line 21
    .line 22
    iget-object v1, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 23
    .line 24
    iget-object v2, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 25
    .line 26
    if-eq v1, v2, :cond_3

    .line 27
    .line 28
    return v0

    .line 29
    :cond_3
    iget-object p0, p0, Ldh8;->q0:Lgh8;

    .line 30
    .line 31
    iget-object p1, p1, Ldh8;->q0:Lgh8;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lgh8;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "[simple type, class "

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lba7;->w0()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 p0, 0x5d

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public w0()Ljava/lang/String;
    .locals 5

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
    iget-object v1, p0, Ldh8;->q0:Lgh8;

    .line 13
    .line 14
    iget-object v2, v1, Lgh8;->Y:[Ldh8;

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    if-lez v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Ldh8;->v0(I)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    const/16 p0, 0x3c

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    :goto_0
    if-ge p0, v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Lgh8;->d(I)Ldh8;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-lez p0, :cond_0

    .line 38
    .line 39
    const/16 v4, 0x2c

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v3}, Ldh8;->N0()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    add-int/lit8 p0, p0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/16 p0, 0x3e

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
