.class public final Lzp8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lq61;


# instance fields
.field public final X:Lzp8;

.field public final Y:Lib1;


# direct methods
.method public constructor <init>(Lzp8;Lib1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzp8;->X:Lzp8;

    .line 5
    .line 6
    iput-object p2, p0, Lzp8;->Y:Lib1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge B0(Ls61;)Ls61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge H0(Lr61;)Lq61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->t(Lq61;Lr61;)Lq61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final U(Lrn2;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final a(Lib1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lzp8;->Y:Lib1;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lzp8;->X:Lzp8;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lzp8;->a(Lib1;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    const-string p0, "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details."

    .line 14
    .line 15
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final bridge a0(Lr61;)Ls61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->I(Lq61;Lr61;)Ls61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getKey()Lr61;
    .locals 0

    .line 1
    sget-object p0, Lqe4;->C0:Lqe4;

    .line 2
    .line 3
    return-object p0
.end method
