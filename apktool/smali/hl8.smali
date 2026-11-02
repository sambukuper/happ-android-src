.class public final Lhl8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final a:Lhl8;

.field public static final b:Lsc3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhl8;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhl8;->a:Lhl8;

    .line 7
    .line 8
    const-string v0, "kotlin.UShort"

    .line 9
    .line 10
    sget-object v1, Ls87;->a:Ls87;

    .line 11
    .line 12
    invoke-static {v1, v0}, Lg33;->c(Low3;Ljava/lang/String;)Lsc3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lhl8;->b:Lsc3;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldl8;

    .line 2
    .line 3
    iget-short p0, p2, Ldl8;->X:S

    .line 4
    .line 5
    sget-object p2, Lhl8;->b:Lsc3;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lol7;->i(Le37;)Lol7;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p0}, Lol7;->s(S)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lhl8;->b:Lsc3;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lrd1;->p(Le37;)Lrd1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lrd1;->B()S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    new-instance p1, Ldl8;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Ldl8;-><init>(S)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lhl8;->b:Lsc3;

    .line 2
    .line 3
    return-object p0
.end method
