.class public final Lll;
.super Lgl;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final D0:Lul;

.field public final E0:Ldh8;

.field public final F0:I


# direct methods
.method public constructor <init>(Lul;Ldh8;Lpi8;Lyr2;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p4}, Lgl;-><init>(Lpi8;Lyr2;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lll;->D0:Lul;

    .line 5
    .line 6
    iput-object p2, p0, Lll;->E0:Ldh8;

    .line 7
    .line 8
    iput p5, p0, Lll;->F0:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B0()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lll;->D0:Lul;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgl;->B0()Ljava/lang/reflect/Member;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final C0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    iget-object p0, p0, Lll;->D0:Lul;

    .line 4
    .line 5
    invoke-virtual {p0}, Lgl;->z0()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "Cannot call getValue() on constructor parameter of "

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public final E0(Lyr2;)Lvj8;
    .locals 2

    .line 1
    iget-object v0, p0, Lgl;->C0:Lyr2;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, Lll;->D0:Lul;

    .line 7
    .line 8
    iget-object v1, v0, Lul;->D0:[Lyr2;

    .line 9
    .line 10
    iget p0, p0, Lll;->F0:I

    .line 11
    .line 12
    aput-object p1, v1, p0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lul;->F0(I)Lll;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final K()I
    .locals 0

    .line 1
    iget-object p0, p0, Lll;->D0:Lul;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvj8;->K()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final N()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lll;->E0:Ldh8;

    .line 2
    .line 3
    iget-object p0, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 4
    .line 5
    return-object p0
.end method

.method public final Q()Ldh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lll;->E0:Ldh8;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-class v0, Lll;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lit0;->o(Ljava/lang/Class;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    check-cast p1, Lll;

    .line 14
    .line 15
    iget-object v0, p1, Lll;->D0:Lul;

    .line 16
    .line 17
    iget-object v1, p0, Lll;->D0:Lul;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lvj8;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget p1, p1, Lll;->F0:I

    .line 26
    .line 27
    iget p0, p0, Lll;->F0:I

    .line 28
    .line 29
    if-ne p1, p0, :cond_2

    .line 30
    .line 31
    :goto_0
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lll;->D0:Lul;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvj8;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lll;->F0:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "[parameter #"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lll;->F0:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", annotations: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lgl;->C0:Lyr2;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "]"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final z0()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lll;->D0:Lul;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgl;->z0()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
