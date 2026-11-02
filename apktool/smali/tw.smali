.class public final Ltw;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lb85;


# static fields
.field public static final a:Ltw;

.field public static final b:Lx82;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltw;->a:Ltw;

    .line 7
    .line 8
    const-string v0, "logRequest"

    .line 9
    .line 10
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ltw;->b:Lx82;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lv40;

    .line 2
    .line 3
    check-cast p2, Lc85;

    .line 4
    .line 5
    check-cast p1, Ltx;

    .line 6
    .line 7
    iget-object p0, p1, Ltx;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    sget-object p1, Ltw;->b:Lx82;

    .line 10
    .line 11
    invoke-interface {p2, p1, p0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 12
    .line 13
    .line 14
    return-void
.end method
