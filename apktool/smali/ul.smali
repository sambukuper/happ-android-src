.class public abstract Lul;
.super Lgl;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final D0:[Lyr2;


# direct methods
.method public constructor <init>(Lpi8;Lyr2;[Lyr2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgl;-><init>(Lpi8;Lyr2;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lul;->D0:[Lyr2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final F0(I)Lll;
    .locals 6

    .line 1
    new-instance v0, Lll;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lul;->H0(I)Ldh8;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v1, p0, Lul;->D0:[Lyr2;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-ge p1, v3, :cond_0

    .line 15
    .line 16
    aget-object v1, v1, p1

    .line 17
    .line 18
    :goto_0
    move-object v4, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    iget-object v3, p0, Lgl;->B0:Lpi8;

    .line 23
    .line 24
    move-object v1, p0

    .line 25
    move v5, p1

    .line 26
    invoke-direct/range {v0 .. v5}, Lll;-><init>(Lul;Ldh8;Lpi8;Lyr2;I)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public abstract G0()I
.end method

.method public abstract H0(I)Ldh8;
.end method

.method public abstract I0(I)Ljava/lang/Class;
.end method
