.class public final Luf2;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/Object;

.field public synthetic g0:Ljava/lang/Object;

.field public h0:I


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Luf2;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Luf2;->h0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Luf2;->h0:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p1, p0}, Ldh3;->r(Lze2;Ljava/lang/Object;Ljava/lang/Object;Ls51;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lc71;->X:Lc71;

    .line 15
    .line 16
    return-object p0
.end method
