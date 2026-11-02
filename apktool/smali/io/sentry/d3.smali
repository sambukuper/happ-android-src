.class public final Lio/sentry/d3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/g1;


# static fields
.field public static final b:Lio/sentry/d3;


# instance fields
.field public final a:Lio/sentry/util/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/d3;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/d3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/d3;->b:Lio/sentry/d3;

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
    const/4 v2, 0x4

    .line 9
    invoke-direct {v1, v2}, Lio/sentry/c2;-><init>(B)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/d3;->a:Lio/sentry/util/g;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final A()Lio/sentry/protocol/e;
    .locals 0

    .line 1
    new-instance p0, Lio/sentry/protocol/e;

    .line 2
    .line 3
    invoke-direct {p0}, Lio/sentry/protocol/e;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final B(Lio/sentry/g4;)Lio/sentry/b4;
    .locals 0

    .line 1
    new-instance p0, Lio/sentry/b4;

    .line 2
    .line 3
    invoke-direct {p0}, Lio/sentry/b4;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final C()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final D(Lio/sentry/i4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final E(Lio/sentry/protocol/w;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final F(Lio/sentry/s1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final G()Ljava/util/List;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final H()Lio/sentry/protocol/i0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final I()Ljava/util/List;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final J()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final K(Lio/sentry/b4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Lio/sentry/g;Lio/sentry/n0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lio/sentry/protocol/j;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    return-void
.end method

.method public final clone()Lio/sentry/g1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/d3;->b:Lio/sentry/d3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 0

    .line 4
    sget-object p0, Lio/sentry/d3;->b:Lio/sentry/d3;

    return-object p0
.end method

.method public final g()Lio/sentry/protocol/w;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getExtras()Ljava/util/Map;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final getRequest()Lio/sentry/protocol/r;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final h(Lio/sentry/protocol/w;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i()Lio/sentry/s6;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/d3;->a:Lio/sentry/util/g;

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

.method public final j()Lio/sentry/s1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final k()Lio/sentry/d7;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final l()Lio/sentry/internal/debugmeta/c;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final m()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n()Lio/sentry/featureflags/b;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/featureflags/c;->X:Lio/sentry/featureflags/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Lio/sentry/q1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final p()Lio/sentry/d7;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final q()Ljava/util/Queue;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayDeque;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final r()Lio/sentry/s5;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final s()Lio/sentry/b4;
    .locals 0

    .line 1
    new-instance p0, Lio/sentry/b4;

    .line 2
    .line 3
    invoke-direct {p0}, Lio/sentry/b4;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final t(Lio/sentry/h4;)Lio/sentry/d7;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final u(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final v()Lio/sentry/l1;
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/h3;->a:Lio/sentry/h3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final w()Ljava/util/Map;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final x()Ljava/util/List;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final y()Ljava/util/List;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final z(Lio/sentry/j5;)V
    .locals 0

    .line 1
    return-void
.end method
