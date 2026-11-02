.class public final Lio/sentry/e3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/i1;


# static fields
.field public static final b:Lio/sentry/e3;


# instance fields
.field public final a:Lio/sentry/util/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/e3;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/e3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/e3;->b:Lio/sentry/e3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/g;

    .line 5
    .line 6
    new-instance v1, Lio/sentry/c2;

    .line 7
    .line 8
    const/4 v2, 0x5

    .line 9
    invoke-direct {v1, v2}, Lio/sentry/c2;-><init>(B)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/e3;->a:Lio/sentry/util/g;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/g;Lio/sentry/n0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final clone()Lio/sentry/b1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/z2;->b:Lio/sentry/z2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 0

    .line 4
    sget-object p0, Lio/sentry/z2;->b:Lio/sentry/z2;

    return-object p0
.end method

.method public final close(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()Ls91;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final f(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Lio/sentry/internal/debugmeta/c;Lio/sentry/n0;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lio/sentry/w3;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Lio/sentry/s6;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/e3;->a:Lio/sentry/util/g;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/sentry/s6;

    .line 8
    .line 9
    return-object p0
.end method

.method public final isEnabled()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j()Lio/sentry/s1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final k()V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(Lio/sentry/n7;Lio/sentry/o7;)Lio/sentry/s1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/n3;->a:Lio/sentry/n3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Lio/sentry/i1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final o(Lio/sentry/l4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final p(Li61;Lio/sentry/n0;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final r(Lio/sentry/u6;Lio/sentry/n0;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s()Lio/sentry/g1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/d3;->b:Lio/sentry/d3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t()Lio/sentry/g1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/d3;->b:Lio/sentry/d3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final u()Lio/sentry/a1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/u2;->Z:Lio/sentry/u2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final v(Ljava/lang/String;Lio/sentry/s5;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final w(Lio/sentry/protocol/f0;Lio/sentry/l7;Lio/sentry/n0;Lio/sentry/z3;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x(Ljava/lang/String;)Lio/sentry/i1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/e3;->b:Lio/sentry/e3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final y(Lio/sentry/i1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final z(Lio/sentry/j5;Lio/sentry/n0;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method
