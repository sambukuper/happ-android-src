.class public interface abstract Lj$/time/chrono/k;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Comparable;


# direct methods
.method public static o(Lj$/time/temporal/TemporalAccessor;)Lj$/time/chrono/k;
    .locals 1

    .line 1
    const-string v0, "temporal"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lj$/time/temporal/p;->b:Lj$/time/e;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lj$/time/temporal/TemporalAccessor;->d(Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lj$/time/chrono/k;

    .line 13
    .line 14
    sget-object v0, Lj$/time/chrono/r;->c:Lj$/time/chrono/r;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    const-string p0, "defaultObj"

    .line 20
    .line 21
    invoke-static {v0, p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-object v0
.end method


# virtual methods
.method public abstract D(Lj$/time/temporal/TemporalAccessor;)Lj$/time/chrono/ChronoLocalDate;
.end method

.method public E(Lj$/time/LocalDateTime;)Lj$/time/chrono/ChronoLocalDateTime;
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Lj$/time/chrono/k;->D(Lj$/time/temporal/TemporalAccessor;)Lj$/time/chrono/ChronoLocalDate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Lj$/time/LocalTime;->x(Lj$/time/temporal/TemporalAccessor;)Lj$/time/LocalTime;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1}, Lj$/time/chrono/ChronoLocalDate;->F(Lj$/time/LocalTime;)Lj$/time/chrono/ChronoLocalDateTime;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Lj$/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    new-instance p1, Lj$/time/DateTimeException;

    .line 16
    .line 17
    const-class v0, Lj$/time/LocalDateTime;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Unable to obtain ChronoLocalDateTime from TemporalAccessor: "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method public abstract G()Lj$/time/chrono/ChronoLocalDate;
.end method

.method public abstract J(III)Lj$/time/chrono/ChronoLocalDate;
.end method

.method public abstract L(Ljava/util/Map;Lj$/time/format/v;)Lj$/time/chrono/ChronoLocalDate;
.end method

.method public abstract M(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/chrono/h;
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract hashCode()I
.end method

.method public abstract n(J)Lj$/time/chrono/ChronoLocalDate;
.end method

.method public abstract q()Ljava/lang/String;
.end method

.method public abstract r(II)Lj$/time/chrono/ChronoLocalDate;
.end method

.method public abstract toString()Ljava/lang/String;
.end method

.method public abstract v(Lj$/time/temporal/ChronoField;)Lj$/time/temporal/s;
.end method

.method public abstract w()Ljava/util/List;
.end method

.method public abstract y(I)Lj$/time/chrono/l;
.end method

.method public abstract z(Lj$/time/chrono/l;I)I
.end method
