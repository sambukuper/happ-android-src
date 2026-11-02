.class public final Lwr8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh1;
.implements Lcc1;


# instance fields
.field public final a:Lps;


# direct methods
.method public constructor <init>(Lps;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwr8;->a:Lps;

    .line 5
    .line 6
    return-void
.end method

.method public static p(Lwr8;)V
    .locals 4

    .line 1
    new-instance v0, Li97;

    .line 2
    .line 3
    new-instance v1, Lc30;

    .line 4
    .line 5
    new-instance v2, Lfs8;

    .line 6
    .line 7
    sget-object v3, Ldg5;->Y:Ldg5;

    .line 8
    .line 9
    invoke-direct {v2, v3}, Lfs8;-><init>(Ldg5;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v2}, Lc30;-><init>(Lz82;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Li97;-><init>(Lc30;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lwr8;->a:Lps;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lps;->a(Lqj2;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static q(Lwr8;)V
    .locals 3

    .line 1
    new-instance v0, Lc30;

    .line 2
    .line 3
    new-instance v1, Lcs8;

    .line 4
    .line 5
    sget-object v2, Ldg5;->Y:Ldg5;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcs8;-><init>(Ldg5;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lc30;-><init>(Lz82;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lwr8;->a:Lps;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lps;->a(Lqj2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static r(Lwr8;)V
    .locals 3

    .line 1
    new-instance v0, Lc30;

    .line 2
    .line 3
    new-instance v1, Lds8;

    .line 4
    .line 5
    sget-object v2, Ldg5;->Y:Ldg5;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lds8;-><init>(Ldg5;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lc30;-><init>(Lz82;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lwr8;->a:Lps;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lps;->a(Lqj2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final i()Lps;
    .locals 0

    .line 1
    iget-object p0, p0, Lwr8;->a:Lps;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Lh1;
    .locals 2

    .line 1
    new-instance p0, Lwr8;

    .line 2
    .line 3
    new-instance v0, Lps;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1}, Lps;-><init>(B)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lwr8;-><init>(Lps;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
