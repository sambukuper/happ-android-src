.class public final Ld05;
.super Lmp4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final f0:Lem5;

.field public g0:Lza4;

.field public final h0:I


# direct methods
.method public constructor <init>(Lem5;Ljava/lang/Object;Lza4;)V
    .locals 2

    .line 1
    iget-object v0, p3, Lza4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, p2, v0, v1}, Lmp4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld05;->f0:Lem5;

    .line 8
    .line 9
    iput-object p3, p0, Ld05;->g0:Lza4;

    .line 10
    .line 11
    iget-object p1, p1, Lem5;->f0:Lol5;

    .line 12
    .line 13
    iget p1, p1, Lol5;->h0:I

    .line 14
    .line 15
    iput p1, p0, Ld05;->h0:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ld05;->g0:Lza4;

    .line 2
    .line 3
    iget-object p0, p0, Lza4;->a:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Ld05;->g0:Lza4;

    .line 2
    .line 3
    iget-object v1, v0, Lza4;->a:Ljava/lang/Object;

    .line 4
    .line 5
    new-instance v2, Lza4;

    .line 6
    .line 7
    iget-object v3, v0, Lza4;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, v0, Lza4;->c:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v2, p1, v3, v0}, Lza4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v2, p0, Ld05;->g0:Lza4;

    .line 15
    .line 16
    iget-object v0, p0, Ld05;->f0:Lem5;

    .line 17
    .line 18
    iget-object v3, v0, Lem5;->f0:Lol5;

    .line 19
    .line 20
    iget v4, v3, Lol5;->h0:I

    .line 21
    .line 22
    iget v5, p0, Ld05;->h0:I

    .line 23
    .line 24
    iget-object p0, p0, Lmp4;->Y:Ljava/lang/Object;

    .line 25
    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput-object p1, v0, Lem5;->X:Ldm5;

    .line 30
    .line 31
    invoke-virtual {v3, p0, v2}, Lol5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_0
    invoke-virtual {v3, p0}, Lol5;->containsKey(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, p0, p1}, Lem5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object v1
.end method
