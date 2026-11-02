.class public final Lk38;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh38;


# instance fields
.field public final X:J

.field public final synthetic Y:Ll38;


# direct methods
.method public constructor <init>(Ll38;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk38;->Y:Ll38;

    .line 5
    .line 6
    iput-wide p2, p0, Lk38;->X:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final S()Lg38;
    .locals 0

    .line 1
    iget-object p0, p0, Lk38;->Y:Ll38;

    .line 2
    .line 3
    invoke-static {p0}, Lp38;->b(Lnh1;)Lg38;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final j(Ly24;)J
    .locals 4

    .line 1
    iget-object v0, p0, Lk38;->Y:Ll38;

    .line 2
    .line 3
    iget-object v0, v0, Ll38;->t0:Lrh5;

    .line 4
    .line 5
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ly24;

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ly24;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    return-wide v1

    .line 22
    :cond_0
    iget-wide v1, p0, Lk38;->X:J

    .line 23
    .line 24
    invoke-interface {v0, v1, v2}, Ly24;->n(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-interface {p1, v0, v1}, Ly24;->E(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    return-wide p0

    .line 33
    :cond_1
    const-string p0, "Tried to open context menu before the anchor was placed."

    .line 34
    .line 35
    invoke-static {p0}, Lzc3;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lb61;->n()V

    .line 39
    .line 40
    .line 41
    return-wide v1
.end method

.method public final m(Ly24;)Ls86;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lk38;->j(Ly24;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    invoke-static {p0, p1, v0, v1}, Lu70;->n(JJ)Ls86;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
